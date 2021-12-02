package io.vsys.dictionary;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import io.vsys.dictionary.domain.DictionaryBook;
import io.vsys.dictionary.domain.WordTranslation;
import io.vsys.dictionary.service.DictionaryService;


@SpringBootApplication
public class DictionaryApplication {
	
	@Autowired
	private DictionaryService dictionaryService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DictionaryApplication.class, args);
	}

	@Bean
	CommandLineRunner init(){

		return (evt)->{

			DictionaryBook dictionaryBook = new DictionaryBook();
			dictionaryBook.setWord("Love");


			WordTranslation wordTranslation= new WordTranslation();
			wordTranslation.setMeaning("liebe");
			wordTranslation.setDictionaryBook(dictionaryBook);
			dictionaryBook.addMeining(wordTranslation);
			//**??dictionaryService.save(dictionaryBook);
			
			WordTranslation wordTranslation1= new WordTranslation();
			wordTranslation1.setMeaning("mag");
			wordTranslation1.setDictionaryBook(dictionaryBook);
			dictionaryBook.addMeining(wordTranslation1);

			dictionaryService.save("Love", "mag");
			//*!cascade take this Task 
			//*translationReository.save(wordTranslation);
			System.out.println("********************************");
			System.out.println(dictionaryService.getDictionary());
			System.out.println("********************************");

		};

	}
}

package io.vsys.dictionary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import io.vsys.dictionary.Repository.DictionaryBookRepository;
import io.vsys.dictionary.domain.DictionaryBook;
import io.vsys.dictionary.domain.WordTranslation;

@Service
public class DictionaryService {
    
    @Autowired
    private DictionaryBookRepository dictionaryBookRepository;


    public List<DictionaryBook> getDictionary(){
         return dictionaryBookRepository.findAll();
    }

    public DictionaryBook save(String word, String means){
        
        DictionaryBook dictionaryBook = new DictionaryBook();
        dictionaryBook.setWord(word);
        WordTranslation wordTranslation= new WordTranslation();
        wordTranslation.setMeaning(means);
        wordTranslation.setDictionaryBook(dictionaryBook);
        dictionaryBook.addMeining(wordTranslation);

        return dictionaryBookRepository.save(dictionaryBook);
    }

    public DictionaryBook getDictionaryBook(Long id){
        return dictionaryBookRepository.findById(id).get();
    }


    
}

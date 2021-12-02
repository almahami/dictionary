package io.vsys.dictionary.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import io.vsys.dictionary.common.BaseEntity;

@Entity
public class WordTranslation extends BaseEntity<Long>{
    
    private String meaning;
    
    @ManyToOne
    private DictionaryBook dictionaryBook;

    public WordTranslation(){}

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public DictionaryBook getDictionaryBook() {
        return dictionaryBook;
    }

    public void setDictionaryBook(DictionaryBook dictionaryBook) {
        this.dictionaryBook = dictionaryBook;
    }

    @Override
    public String toString() {
        return "translation [meaning=" + meaning + "]";
    }

    

}

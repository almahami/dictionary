package io.vsys.dictionary.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import io.vsys.dictionary.common.BaseEntity;

@Entity
public class DictionaryBook extends BaseEntity<Long>{
    
    private String word;

    @OneToMany( mappedBy = "dictionaryBook",fetch = FetchType.EAGER,cascade = CascadeType.ALL )
    private List<WordTranslation> meinings = new ArrayList<>();

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<WordTranslation> getMeinings() {
        return meinings;
    }

    public void setMeiningsList(List<WordTranslation> meinings) {
        this.meinings = meinings;
    }

    public void addMeining(WordTranslation newTranslation){
        meinings.add(newTranslation);
    } 
    
    @Override
    public String toString() {
        return "dictionary [word=" + word + "]";
    }

    
}

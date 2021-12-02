package io.vsys.dictionary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.vsys.dictionary.domain.WordTranslation;


public interface TranslationReository extends JpaRepository<WordTranslation,Long>{
    
}

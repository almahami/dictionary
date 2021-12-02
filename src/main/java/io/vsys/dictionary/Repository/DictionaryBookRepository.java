package io.vsys.dictionary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.vsys.dictionary.domain.DictionaryBook;


public interface DictionaryBookRepository extends JpaRepository<DictionaryBook,Long> {
    
}

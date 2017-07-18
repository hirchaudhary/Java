package com.hiral.language.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiral.language.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{

}

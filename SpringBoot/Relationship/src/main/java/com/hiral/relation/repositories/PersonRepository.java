package com.hiral.relation.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiral.relation.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{
	
}

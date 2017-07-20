package com.hiral.dojos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiral.dojos.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{
	
}

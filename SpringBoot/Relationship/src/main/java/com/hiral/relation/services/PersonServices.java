package com.hiral.relation.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hiral.relation.models.Person;
import com.hiral.relation.repositories.PersonRepository;

@Service
public class PersonServices {
	private PersonRepository personRepository;
	
	public PersonServices(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public void addPerson(Person person){
		personRepository.save(person);
	}
	
	public List<Person> getPersons(){
		return (List<Person>) personRepository.findAll();
	}
}

package com.hiral.dojos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hiral.dojos.models.Dojo;
import com.hiral.dojos.repositories.DojoRepository;

@Service
public class DojoService {
	private DojoRepository dojoRepository;

	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	public void addDojo(Dojo dojo){
		dojoRepository.save(dojo);
	}
	
	public List<Dojo> allDojos(){
		return (List<Dojo>) dojoRepository.findAll();
	}
	
	public Dojo findOneDojo(Long id){
		return dojoRepository.findOne(id);
	}
}

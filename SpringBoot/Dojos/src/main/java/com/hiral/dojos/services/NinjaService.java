package com.hiral.dojos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hiral.dojos.models.Ninja;
import com.hiral.dojos.repositories.NinjaRepository;

@Service
public class NinjaService {
	private NinjaRepository ninjaRepository;
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	public void addNinja(Ninja ninja) {
		ninjaRepository.save(ninja);
	}

}

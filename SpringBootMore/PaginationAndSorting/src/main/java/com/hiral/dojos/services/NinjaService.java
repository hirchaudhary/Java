package com.hiral.dojos.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hiral.dojos.models.Ninja;
import com.hiral.dojos.repositories.NinjaRepository;

@Service
@Transactional
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepository;

	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}

	public void addNinja(Ninja ninja) {
		ninjaRepository.save(ninja);
	}

	private static final int PAGE_SIZE = 5;

	public Page<Ninja> ninjasPerPage(int pageNumber) {
		PageRequest pageRequest = new PageRequest(pageNumber, PAGE_SIZE, Sort.Direction.ASC, "lastName");
		return ninjaRepository.findAll(pageRequest);
	}

}

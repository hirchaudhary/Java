package com.hiral.belt.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hiral.belt.models.Ring;
import com.hiral.belt.repository.RingRepository;

@Service
public class RingService {
	private RingRepository ringRepository;

	public RingService(RingRepository ringRepository) {
		this.ringRepository = ringRepository;
	}

	public void createRing(Ring ring) {
		ringRepository.save(ring);
	}

	public void deleteById(Long id) {
		ringRepository.deleteOne(id);
	}

	public List<Ring> findAll() {
		return (List<Ring>) ringRepository.findAll();
	}

	public List<Object[]> findAdminRings() {
		return ringRepository.findAdminRings();
	}

	public Ring findById(long ringId) {
		return ringRepository.findOne(ringId);
	}

	public void update(Ring findById) {
		ringRepository.save(findById);
	}

	public void deleteRingByUser(Long id) {
		ringRepository.deleteRingByUser(id);
	}

}

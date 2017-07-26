package com.hiral.dojos.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.hiral.dojos.models.Ninja;

@Repository
public interface NinjaRepository extends PagingAndSortingRepository<Ninja, Long> {
	List<Ninja> findAllNinjaByDojoId(Long id);
}

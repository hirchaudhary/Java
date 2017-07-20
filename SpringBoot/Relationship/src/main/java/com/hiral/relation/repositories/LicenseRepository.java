package com.hiral.relation.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiral.relation.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long>{

}

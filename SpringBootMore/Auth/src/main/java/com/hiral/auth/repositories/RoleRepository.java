package com.hiral.auth.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiral.auth.models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
	@Override
	List<Role> findAll();

	List<Role> findByName(String name);
}

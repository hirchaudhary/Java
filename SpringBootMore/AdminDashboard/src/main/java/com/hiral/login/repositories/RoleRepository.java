package com.hiral.login.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiral.login.models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
	@Override
	List<Role> findAll();

	Role findByName(String name);
}

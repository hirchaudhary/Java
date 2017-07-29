package com.hiral.belt.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiral.belt.models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
	@Override
	List<Role> findAll();

	Role findByName(String name);

	@Transactional
	@Modifying
	@Query(value = "DELETE FROM users_roles WHERE users_roles.user_id = ?1", nativeQuery = true)
	void deleteByRole(Long id);
}

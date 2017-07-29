package com.hiral.belt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hiral.belt.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);

	User findById(Long id);

	User findByEmail(String email);

	@Query(value = "SELECT * FROM users u JOIN users_roles ur ON u.id = ur.user_id JOIN roles r ON ur.role_id = r.id WHERE r.name='ROLE_USER'", nativeQuery = true)
	List<User> findByRole();

}

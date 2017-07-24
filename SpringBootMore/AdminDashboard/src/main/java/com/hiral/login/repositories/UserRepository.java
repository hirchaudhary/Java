package com.hiral.login.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hiral.login.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String email);

	User findById(Long id);
}

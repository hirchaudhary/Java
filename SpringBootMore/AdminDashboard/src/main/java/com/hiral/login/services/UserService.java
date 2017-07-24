package com.hiral.login.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hiral.login.models.Role;
import com.hiral.login.models.User;
import com.hiral.login.repositories.RoleRepository;
import com.hiral.login.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public UserService(UserRepository userRepository, RoleRepository roleRepository,
			BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	public void saveWithUserRole(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		ArrayList<Role> userRole = new ArrayList<>();
		userRole.add(roleRepository.findByName("ROLE_USER"));
		user.setRoles(userRole);
		userRepository.save(user);
	}

	public void saveUserWithAdminRole(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		ArrayList<Role> userRole = new ArrayList<>();
		userRole.add(roleRepository.findByName("ROLE_ADMIN"));
		user.setRoles(userRole);
		userRepository.save(user);
	}

	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	public void update(User user) {
		user.setLastSignin(new Date());
		userRepository.save(user);
	}

	public List<User> findAll() {
		return (List<User>) userRepository.findAll();
	}

	public void deleteById(Long id) {
		userRepository.delete(id);
	}

	public User findById(Long id) {
		return userRepository.findById(id);
	}
}

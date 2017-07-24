package com.hiral.login.services;

import org.springframework.stereotype.Service;

import com.hiral.login.models.Role;
import com.hiral.login.repositories.RoleRepository;

@Service
public class RoleService {
	private RoleRepository roleRepository;

	public RoleService(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	public Role findByName(String name) {
		return roleRepository.findByName(name);
	}
}

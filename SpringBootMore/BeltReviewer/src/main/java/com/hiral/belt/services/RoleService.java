package com.hiral.belt.services;

import org.springframework.stereotype.Service;

import com.hiral.belt.models.Role;
import com.hiral.belt.repository.RoleRepository;

@Service
public class RoleService {
	private RoleRepository roleRepository;

	public RoleService(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	public Role findByName(String name) {
		return roleRepository.findByName(name);
	}

	public void deleteRole(Long id) {
		roleRepository.deleteByRole(id);
	}
}

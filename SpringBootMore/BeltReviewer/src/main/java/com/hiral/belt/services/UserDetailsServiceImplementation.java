package com.hiral.belt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hiral.belt.models.Role;
import com.hiral.belt.models.User;
import com.hiral.belt.repository.UserRepository;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService {
	private UserRepository userRepository;

	public UserDetailsServiceImplementation(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String input) throws UsernameNotFoundException {
		User byUsername = userRepository.findByUsername(input);
		User byEmail = userRepository.findByEmail(input);
		if (byUsername == null && byEmail == null) {
			throw new UsernameNotFoundException("User not found");
		}
		if (byUsername != null) {
			return new org.springframework.security.core.userdetails.User(byUsername.getUsername(),
					byUsername.getPassword(), getAuthorities(byUsername));
		}
		return new org.springframework.security.core.userdetails.User(byEmail.getUsername(), byEmail.getPassword(),
				getAuthorities(byEmail));
	}

	private List<GrantedAuthority> getAuthorities(User user) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (Role role : user.getRoles()) {
			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getName());
			authorities.add(grantedAuthority);
		}
		return authorities;
	}
}
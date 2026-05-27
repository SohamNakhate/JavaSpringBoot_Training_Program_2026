package com.example.rcoem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.rcoem.model.UserModel;
import com.example.rcoem.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository; 
	
	public UserDetails loadUserByUsername(String username) 
		throws UsernameNotFoundException{
		 UserModel user = userRepository
	                .findByUsername(username)
	                .orElseThrow(() ->
	                    new UsernameNotFoundException(
	                        "User not found"));

	        return User.builder()
	                .username(user.getUsername())
	                .password(user.getPassword())
	                .roles("USER")
	                .build();
	}
}

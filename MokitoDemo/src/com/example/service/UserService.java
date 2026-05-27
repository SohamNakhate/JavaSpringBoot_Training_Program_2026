package com.example.service;

import com.example.model.User;
import com.example.repository.*;

public class UserService {
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User getUserById(int id ) {
		return userRepository.findById(id);
	}
}

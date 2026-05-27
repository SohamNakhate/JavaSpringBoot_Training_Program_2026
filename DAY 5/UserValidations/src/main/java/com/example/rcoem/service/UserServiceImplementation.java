package com.example.rcoem.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.rcoem.repository.UserRepository;

import jakarta.validation.Valid;

import com.example.rcoem.model.*;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	public UserRepository userRepository; 
	
	
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserModel addUser(UserModel user) {

	    user.setPassword(
	        passwordEncoder.encode(
	            user.getPassword()
	        )
	    );

	    return userRepository.save(user);
	}
	
	
	@Override
	public List<UserModel> getAllUsers(){
		return userRepository.findAll(); 
	}
	
	
	public String removeUser(Integer id) {
		if(userRepository.existsById(id)) {
			userRepository.deleteById(id);
			return "User Deleted Successfully"; 
		}
		else 
			return "User Not Found:"; 
	}
	
	
}

package com.example.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;



public class UserServiceTest {

	@Mock
	UserRepository userRepository; 
	
	@InjectMocks
	UserService userService; 
	
	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this); 
	}
	
	@Test
	public void testGetUserById() {
		User fakeUser = new User(1, "Aditya"); 
		
		when(userRepository.findById(1)).thenReturn(fakeUser); 
		
		User result = userService.getUserById(1); 
		
		assertEquals("Aditya", result.getName()); 
		verify(userRepository).findById(1); 
	}
}

package com.example.rcoem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import com.example.rcoem.model.AuthRequest;
import com.example.rcoem.model.AuthResponse;
import com.example.rcoem.service.JwtService;

@RestController
@RequestMapping("/api/v1")
public class AuthController {

	@Autowired
	private AuthenticationManager authenticationManager; 
	
	
	  @Autowired
	    private JwtService jwtService;


	    @PostMapping("/authenticate")
	    public AuthResponse authenticate(
	            @RequestBody AuthRequest request) {

	        authenticationManager.authenticate(

	                new UsernamePasswordAuthenticationToken(
	                        request.getUsername(),
	                        request.getPassword()
	                )
	        );

	        String token =
	                jwtService.generateToken(
	                        request.getUsername()
	                );

	        return new AuthResponse(token);
	    }
	
	
}

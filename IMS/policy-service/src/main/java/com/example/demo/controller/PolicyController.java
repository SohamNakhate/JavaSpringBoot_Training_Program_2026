package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Policy;
import com.example.demo.repository.PolicyRepository;

import java.util.List;


@RestController
@RequestMapping("/policy")
public class PolicyController {
	@Autowired
	public PolicyRepository policyRepository; 
	
	@PostMapping("/add")
	public Policy addPolicy(@RequestBody Policy policy ) {
		return policyRepository.save(policy); 
	}
	
	 @GetMapping("/all")
	    public List<Policy> getPolicies(){
	        return policyRepository.findAll();
	    }
}

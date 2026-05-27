package com.example.demo.entity;

import jakarta.persistence.*; 

public class Policy {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long policyId; 
	
	private String policyName; 
	
	private String policyHolderName;

	public Policy(Long policyId, String policyName, String policyHolderName) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyHolderName = policyHolderName;
	}

	public Long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyHolderName=" + policyHolderName
				+ "]";
	}

	public Policy() {
		super();
	} 
	
	
}

package com.example.jpaTrial.model;

import jakarta.persistence.*;


@Entity
@Table(name="Employee_Data")
public class Employee {
	
	@Id
	private int id; 
	private String name; 
	private String departmentName;
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	//Constructors
	public Employee(int id, String name, String departmentName) {
		super();
		this.id = id;
		this.name = name;
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", departmentName=" + departmentName + "]";
	} 
	
	
	
}

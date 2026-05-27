package jUnitTask.studentapp.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public int addMarks(int a, int b) {
		return a + b; 
	}
	
	public double divide (double a, double b) {
		return a / b; 
	}
}

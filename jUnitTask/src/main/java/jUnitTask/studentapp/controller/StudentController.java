package jUnitTask.studentapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome Students"; 
	}
	
	@GetMapping("/course")
	public String course() {
		return "Spring Boot Testing"; 
	}
	
}

package jUnitTask;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import jUnitTask.studentapp.controller.StudentController;

public class StudentControllerTest {

	StudentController stu  = new StudentController(); 
	
	@Test
	public void welcomeTest() {
		String result = stu.welcome(); 
		assertEquals("Welcome Students", result); 
	}
	
	@Test
	public void courseTest() {
		String result = stu.course(); 
		assertEquals("Spring Boot Testing", result); 
	}
}



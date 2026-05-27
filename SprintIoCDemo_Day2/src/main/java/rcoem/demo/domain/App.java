package rcoem.demo.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml"); 
		Employee emp1 = context.getBean("Soham", Employee.class); 
		System.out.println(emp1); 

	}

}

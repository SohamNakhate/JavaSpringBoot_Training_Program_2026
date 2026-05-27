package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); 
		SpringApplication.run(Main.class,args); 
		
	}

}

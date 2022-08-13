package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages = "MyfirstappApplication.java", + "WelcomeController.java")
public class MyfirstappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstappApplication.class, args);
	}

}

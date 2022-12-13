package com.example.FullAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FullApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullApiApplication.class, args);
		System.out.println("App is Ready to go");
	}
	//http://localhost:8080/login
}

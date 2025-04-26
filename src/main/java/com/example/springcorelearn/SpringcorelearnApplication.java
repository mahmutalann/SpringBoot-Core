package com.example.springcorelearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {
				"com.example.springcorelearn",
				"tennis"
				}
		)

public class SpringcorelearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcorelearnApplication.class, args);
	}

}

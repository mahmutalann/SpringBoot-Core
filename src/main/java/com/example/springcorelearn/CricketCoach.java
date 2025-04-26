package com.example.springcorelearn;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach{
	
	public CricketCoach() {
		System.out.println("Instructor : " + getClass().getSimpleName());
	}
	
	// define our init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("In doMyStartupStuff() :  " + getClass().getSimpleName());
	}
	
	// define our destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("In doMyCleanupStuff() :  " + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 1K meters";
	}
}

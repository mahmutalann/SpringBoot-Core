package com.example.springcorelearn;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
	
	public CricketCoach() {
		System.out.println("Instructor : " + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 1K meters";
	}
}

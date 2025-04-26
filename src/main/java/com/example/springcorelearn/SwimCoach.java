package com.example.springcorelearn;

public class SwimCoach implements Coach {
	
	public SwimCoach() {
		System.out.println("Instructor : " + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 15 minutes everyday!";
	}
}

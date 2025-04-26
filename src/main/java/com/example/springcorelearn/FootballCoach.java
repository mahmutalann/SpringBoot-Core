package com.example.springcorelearn;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootballCoach implements Coach{
	
	public FootballCoach() {
		System.out.println("Instructor : " + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 2K meters";
	}

}

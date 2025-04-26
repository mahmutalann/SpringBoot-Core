package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springcorelearn.Coach;
import com.example.springcorelearn.SwimCoach;

@Configuration
public class SportConfig {
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach();
	}
	
	
}

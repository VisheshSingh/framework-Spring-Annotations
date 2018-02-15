package com.vishesh.framework_springanno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyNewConfig {

	// define a bean for chocolate fortune service
	@Bean
	public FortuneService chocolateFortuneService() {
		return new ChocolateFortuneService();
	}

	// define a bean for SoccerCoach and inject the dependency
	@Bean
	public Coach soccerCoach() {
		return new SoccerCoach(chocolateFortuneService());
	}
}

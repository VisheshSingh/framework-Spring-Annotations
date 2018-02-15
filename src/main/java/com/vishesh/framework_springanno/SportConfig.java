package com.vishesh.framework_springanno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("com.vishesh.framework_springanno")
public class SportConfig {

	// define a bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// define a bean for swim coach and inject the dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}

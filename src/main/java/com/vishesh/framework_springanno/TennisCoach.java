package com.vishesh.framework_springanno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> Tennis Coach: Inside default constructor");
	}

	// define init and destroy methods
	@PostConstruct
	public void doStart() {
		System.out.println(">> Inside Startup stuff: Before Bean is called");
	}

	@PreDestroy
	public void doDestroy() {
		System.out.println(">> Inside Destroy stuff: After Bean is destroyed");
	}

	/*
	 * @Autowired public void doSmtg(FortuneService fortuneService) {
	 * System.out.println(">> Tennis Coach: Inside doSmtg() method ");
	 * this.fortuneService = fortuneService; }
	 */

	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

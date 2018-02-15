package com.vishesh.framework_springanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> Tennis Coach: Inside default constructor");
	}

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> Tennis Coach: Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

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

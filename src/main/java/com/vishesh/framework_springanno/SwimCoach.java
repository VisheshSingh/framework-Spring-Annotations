package com.vishesh.framework_springanno;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice butterfly stroke";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

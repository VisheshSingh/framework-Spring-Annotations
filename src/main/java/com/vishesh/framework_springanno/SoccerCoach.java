package com.vishesh.framework_springanno;

public class SoccerCoach implements Coach {

	private FortuneService fortuneService;

	public SoccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice passing for 30 mins...";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

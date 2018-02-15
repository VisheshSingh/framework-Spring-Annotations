package com.vishesh.framework_springanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> Tennis Coach: Inside default constructor");
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

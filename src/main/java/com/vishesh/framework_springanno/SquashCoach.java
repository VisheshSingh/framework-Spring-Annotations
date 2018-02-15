package com.vishesh.framework_springanno;

import org.springframework.stereotype.Component;

@Component
public class SquashCoach implements Coach {

	public String getDailyWorkout() {
		return "Work on your reflexes and be quick...";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}

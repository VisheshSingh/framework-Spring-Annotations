package com.vishesh.framework_springanno;

import org.springframework.stereotype.Component;

@Component
public class SquashCoach implements Coach {

	public String getDailyWorkout() {
		return "Work on your reflexes and be quick...";
	}

}

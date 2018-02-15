package com.vishesh.framework_springanno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SoccerCoachJavaConfigApp {

	public static void main(String[] args) {
		// Load the Spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyNewConfig.class);

		// Retrieve the bean
		SoccerCoach theCoach = context.getBean("soccerCoach", SoccerCoach.class);

		// Call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}

}

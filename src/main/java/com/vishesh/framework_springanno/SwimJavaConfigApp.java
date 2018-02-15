package com.vishesh.framework_springanno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigApp {

	public static void main(String[] args) {
		// Load the Spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// Retrieve the bean
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// Call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// call new swim coach methods
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());

		// close the context
		context.close();

	}

}

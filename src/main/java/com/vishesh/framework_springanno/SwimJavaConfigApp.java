package com.vishesh.framework_springanno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigApp {

	public static void main(String[] args) {
		// Load the Spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// Retrieve the bean
		Coach theCoach = context.getBean("swimCoach", Coach.class);

		// Call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}

}

package com.vishesh.framework_springanno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// load the Spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		// Call the methods on bean
		System.out.println(theCoach.getDailyWorkout());

		// Call the new method on bean
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}
}

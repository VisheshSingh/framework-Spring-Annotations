package com.vishesh.framework_springanno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {
		// load the Spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve the bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		// Check if both are same
		boolean result = (theCoach == alphaCoach);

		System.out.println("Pointing to the same object: " + result);
		System.out.println("\nMemory location of theCoach: " + theCoach);
		System.out.println("\nMemory location of alphaCoach: " + alphaCoach);

		// Close the context
		context.close();
	}

}

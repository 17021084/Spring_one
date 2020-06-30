package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
	// Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach= context.getBean("myCoach" , Coach.class);
		
		// call some stuff
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
		//

		System.out.println("End Of BeanLifeCycleClass");
		
	}

}

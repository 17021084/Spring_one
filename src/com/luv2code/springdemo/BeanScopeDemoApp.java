package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
	// Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach= context.getBean("myCoach" , Coach.class);
		Coach alphaCoach= context.getBean("myCoach" , Coach.class);
		
		//check if they are the same reference
		boolean result = (theCoach==alphaCoach); 
		
		//print out the result
		System.out.println(" Pointing to the same object  " + result);
		System.out.println(" \n Memori location for theCoach " + theCoach);
		System.out.println(" \n Memori location for alphaCoach " + alphaCoach);
		
		//close the context
		context.close();

	}

}

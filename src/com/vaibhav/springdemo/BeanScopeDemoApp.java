package com.vaibhav.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) 
	{
		// Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach aplhaCoach = context.getBean("myCoach",Coach.class);
		
		//check if they are same
		boolean result = theCoach==aplhaCoach;
		
		//print result: true for singleton false for prototype
		System.out.println(result);
		
		//close context
		context.close();
	}

}

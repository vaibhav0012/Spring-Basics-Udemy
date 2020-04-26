package com.vaibhav.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) 
	{
		// Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		// Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		//close context
		context.close();
	}

}

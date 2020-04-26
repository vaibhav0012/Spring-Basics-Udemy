package com.vaibhav.springdemo;

public class BaseballCoach implements Coach
{
	//Define a private field for the dependency
	private FortuneService fortuneService;
	//Create a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout()
	{
		return "30 mins";
	}

	@Override
	public String getDailyFortune() 
	{
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}

package com.vaibhav.springdemo;

public class TrackCoach implements Coach 
{
	//Define a private field for the dependency
	private FortuneService fortuneService;
	//No argument Constructor
	public TrackCoach()
	{
		
	}
	//Create a constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) 
	{
		super();
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5km";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach "+fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff()
	{
		System.out.println("The Coach: init method");
	}
	// add a destroy method
	public void doMyCleanupStuff()
	{
		System.out.println("The Coach: destroy method");
	}
}

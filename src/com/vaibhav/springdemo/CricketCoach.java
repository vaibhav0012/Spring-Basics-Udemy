package com.vaibhav.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	//adding new fields for email an team
	private String email;
	private String team;
	public void setEmail(String email) 
	{
		System.out.println("CricketCoach set email");
		this.email = email;
	}
	public void setTeam(String team) 
	{
		System.out.println("CricketCoach set team");
		this.team = team;
	}
	public String getEmail() 
	{
		return email;
	}
	public String getTeam() 
	{
		return team;
	}
	// non argument constructor
	public CricketCoach()
	{
		System.out.println("CricketCoach: non paratamized constructor");
	}
	//Setter Method
	public void setFortuneService(FortuneService fortuneService) 
	{
		System.out.println("CricketCoach: Setter Method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() 
	{
		return "Bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}

}

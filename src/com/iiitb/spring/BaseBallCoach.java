package com.iiitb.spring;

public class BaseBallCoach implements Coach{
	private FortuneService fortuneservice;
	public BaseBallCoach(FortuneService fortuneservice)
	{
		this.fortuneservice=fortuneservice;
	}
	
	
	


	@Override
	public String getDailyWorkout()
	{
		return "30 mins of workout in Gym";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}
}

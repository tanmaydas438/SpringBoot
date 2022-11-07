package com.iiitb.spring;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFortuneService(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do Net Practice for 1 hr";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

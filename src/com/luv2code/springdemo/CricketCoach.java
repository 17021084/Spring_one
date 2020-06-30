package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	public CricketCoach() {
	}

	
//	public FortuneService getFortunerService() {
//		return fortunerService;
//	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setFortuneService was called ");
		this.fortuneService = fortuneService;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("setEmail called ");
		this.emailAddress = emailAddress;
	}


	public void setTeam(String team) {
		System.out.println("setTeam was called ");
		this.team = team;
	}


	@Override
	public String getDailyWorkout() {
	
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

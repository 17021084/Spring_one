package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		System.out.println("no Arg was called");
	}
	
	//no nhan vao 1 interface, va thang class thuc hien interface nay se dc config o trong file xml , do đó nó đc gọi là configurable 
	public TrackCoach(FortuneService fortuneService) {
		System.out.println("trackCoach constructor was called");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	// cứ gọi thằng getFortune của thằng interface ra. còn thằng class nào phụ thuộc vào file xml
	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("Track coach: inside method doMyStartupStuff  ");
	}

	// add an destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("Track coach: inside method doMyCleanupStuff  ");
	}
}











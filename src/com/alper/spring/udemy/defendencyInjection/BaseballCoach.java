package com.alper.spring.udemy.defendencyInjection;

public class BaseballCoach implements ICoach {
	private IFortuneService fortuneService;
	


	public BaseballCoach(IFortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Baseball coachtan implement getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

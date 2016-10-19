package com.alper.spring.udemy.annotation;

/**
 * @author Alper
 *
 */
public class SwimCoach implements ICoach {

	private IFortuneService fortuneService;
	
	public SwimCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 1000 meters";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

package com.alper.spring.udemy.defendencyInjection;

public class TrackCoach implements ICoach {
	@SuppressWarnings("unused")
	private IFortuneService fortuneService;
	
	public TrackCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "TrackCoach coachtan implement getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "TrackCoach coachtan implement getDailyFortune";
	}

}

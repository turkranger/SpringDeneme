package com.alper.spring.udemy.defendencyInjection;

/**
 * @author Alper
 *
 */
public class CricketCoach implements ICoach {
	private IFortuneService fortuneService;
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach:inside setter method - setEmailAddress");

		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach:inside setter method - setTeam");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Construction icerisinde");
	}

	public void setFortuneService(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("getter metodu icerisinde");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "getDailyWorkout ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "getDailyFortune:"+fortuneService.getFortune();
	}

}

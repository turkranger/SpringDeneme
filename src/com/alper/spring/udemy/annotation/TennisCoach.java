package com.alper.spring.udemy.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Alper
 * 
 */
@Component("theNewCoach")
public class TennisCoach implements ICoach {

	@Autowired
	@Qualifier("happyFortuneService")
	private IFortuneService fortuneService;

	public TennisCoach() {
		System.out.println("TennisCoacah: inside defauld constructor method");
	}

//	Degisken tanýmýna @AutoWired annotationu koymasaydýk setter methoduna
//	gerek vardý
	
//	@AutoWired
//	public void setFortuneService(IFortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//		System.out.println("TennisCoach: inside Setter method");
//	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}
	
	public String getDailyFortune(){
		return fortuneService.getFortune();
	}

}

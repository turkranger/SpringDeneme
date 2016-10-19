package com.alper.spring.udemy.defendencyInjection;
/**
 * @author Alper
 *
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterApp {


	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig2.xml");
		
		CricketCoach theCoach=context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getEmail());
		
		System.out.println(theCoach.getTeam());
		
		context.close();

	}

}

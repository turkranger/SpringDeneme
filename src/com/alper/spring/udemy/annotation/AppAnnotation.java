package com.alper.spring.udemy.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnnotation {


	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Annotation-SpringConfig.xml");
		
		ICoach theCoach=context.getBean("theNewCoach",ICoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
		

	}

}

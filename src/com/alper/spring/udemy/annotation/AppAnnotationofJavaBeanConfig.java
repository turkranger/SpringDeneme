package com.alper.spring.udemy.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppAnnotationofJavaBeanConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		ICoach theCoach = context.getBean("theNewCoach", ICoach.class);

		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		context.close();

	}

}

package com.alper.spring.udemy.beanLifeCycle;


import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author Alper
 *
 */
public class AppScope {

public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Init-Destroy-SpringConfig.xml");
		ICoach theCoach=context.getBean("myCoach",ICoach.class);
		System.out.println(theCoach.getDailyFortune());
		context.close();

	}

}

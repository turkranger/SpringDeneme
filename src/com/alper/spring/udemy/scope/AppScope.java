package com.alper.spring.udemy.scope;


import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author Alper
 *
 */
public class AppScope {


public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Scope-SpringConfig.xml");
		ICoach theCoach=context.getBean("myCoach",ICoach.class);
		ICoach theCoach2=context.getBean("myCoach",ICoach.class);
		boolean result=theCoach==theCoach2;
		System.out.println(result);
		System.out.println(theCoach);
		System.out.println(theCoach2);
		context.close();
	}

}

package com.alper.spring.udemy.InversionofControl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alper
 * 
 */
public class TestSpringProject {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringConfig.xml");
		Restoran restoran = (Restoran) context.getBean("RestoranBean");
		Kafe kafe = (Kafe) context.getBean("KafeBean");
		restoran.greetCustomer();
		restoran.name();
		kafe.Hosgeldiniz();
		kafe.name();
		((AbstractApplicationContext) context).close();
	}
}

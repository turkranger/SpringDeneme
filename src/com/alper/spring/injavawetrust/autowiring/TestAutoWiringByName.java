/**
 * 
 */
package com.alper.spring.injavawetrust.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alper
 *
 */
public class TestAutoWiringByName {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("autowiring.xml");
		
		Employee employee1=context.getBean("employeeid",Employee.class);
		System.out.println(employee1.toString());
		
		Employee employee2= context.getBean("employeeid2",Employee.class);
		System.out.println(employee2.toString());

	}

}

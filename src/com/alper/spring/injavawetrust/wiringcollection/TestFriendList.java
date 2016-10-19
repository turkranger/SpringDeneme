package com.alper.spring.injavawetrust.wiringcollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alper
 * 
 */
public class TestFriendList {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"wiringCollection.xml");

		FriendList fl = context.getBean("friendListId", FriendList.class);

		fl.printList();
	}
}

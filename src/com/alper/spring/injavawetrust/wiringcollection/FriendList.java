package com.alper.spring.injavawetrust.wiringcollection;

import java.util.List;

/**
 * @author Alper
 * 
 */
public class FriendList {

	private List<Friend> liste;

	public List<Friend> getListe() {
		return liste;
	}

	public void setListe(List<Friend> liste) {
		this.liste = liste;
	}

	public void printList() {
		for (Friend friend : liste) {
			System.out.println(friend.getFname() + " " + friend.getLname());
		}
	}
}

package com.alper.spring.udemy.annotation;

public class SadFortuneService implements IFortuneService {


	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is sad day";
	}

}

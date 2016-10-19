package com.alper.spring.udemy.annotation;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements IFortuneService {


	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Random Fortune Service";
	}

}

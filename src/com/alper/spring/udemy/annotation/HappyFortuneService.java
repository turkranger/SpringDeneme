package com.alper.spring.udemy.annotation;

import org.springframework.stereotype.Component;

/**
 * @author Alper
 *
 */
@Component
public class HappyFortuneService implements IFortuneService {
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Happy fortune service";
	}



}

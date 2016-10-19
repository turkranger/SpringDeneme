package com.alper.spring.udemy.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alper
 * 
 */
@Configuration
@ComponentScan("com.alper.spring.udemy.annotation")
public class SportConfig {

	@Bean
	public IFortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	@Bean
	public ICoach swimCoach(){
		return new SwimCoach(sadFortuneService());
	}
}

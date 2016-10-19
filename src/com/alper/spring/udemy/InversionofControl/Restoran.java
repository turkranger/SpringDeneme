package com.alper.spring.udemy.InversionofControl;

/**
 * @author Alper
 *
 */
public class Restoran implements IEsnaf {
	public void greetCustomer(){
		System.out.println("Welcome");
	}

	@Override
	public void name() {
		System.out.println("Restoran sahibiyim");
	}

}

package com.alper.spring.udemy.InversionofControl;

/**
 * @author Alper
 *
 */
public class Kafe implements IEsnaf {
	public void Hosgeldiniz(){
		System.out.println("Hosgeldiniz");
	}

	@Override
	public void name() {
		System.out.println("Kafe sahibiyim");
	}



}

package com.july02.oops.principles;

public class Lion implements Animal{

	@Override
	public void eat() {
		System.out.println("eats all");
	}
	
	public void eat(String s) {
		System.out.println("eats only veg");
	}
	
	@Override
	public void sound() {
		System.out.println("high sound");		
	}

}

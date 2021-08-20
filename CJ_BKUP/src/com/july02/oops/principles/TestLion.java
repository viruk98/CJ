package com.july02.oops.principles;

public class TestLion {

	public static void main(String[] args) {
		Lion l=new Lion();
		l.eat();
		l.eat("veg");
		l.sound();
		System.out.println();
		System.out.println("using interface reference");
		Animal a=new Lion();
		a.eat();
		a.sound();
	}
}

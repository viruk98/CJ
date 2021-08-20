package com.july02.oops.principles;

public class TestHen {

	public static void main(String[] args) {
		Hen h=new Hen();
		h.fly();
		h.eat();
		h.sound();
		Animal a=new Hen();
		a.eat();
		a.sound();
	}
}

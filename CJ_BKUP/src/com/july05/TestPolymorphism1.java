package com.july05;

public class TestPolymorphism1 implements Animal {

	public static void main(String[] args) {
		System.out.println("Tiger");
		TestPolymorphism1 p=new TestPolymorphism1();
		p.sound();
	}

	@Override
	public void sound() {
		System.out.println("tiger sound");
	}
}

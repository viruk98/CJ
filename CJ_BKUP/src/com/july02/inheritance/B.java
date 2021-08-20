package com.july02.inheritance;

public class B extends A {

	public void methodB() {
		System.out.println("method B");
	}
	public static void main(String[] args) {
		B obj=new B();
		obj.methodA();
		obj.methodB();
	}
}

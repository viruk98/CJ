package com.july02.inheritance;

public class C extends B {

	public void methodC() {
		System.out.println(" method c");
	}
	public static void main(String[] args) {
		C obj =new C();
		obj.methodA();
		obj.methodB();
		obj.methodC();
	}
}

package com.july02.inheritance;

public class D extends A{

	public void methodD() {
		System.out.println("D  method");
	}
	public static void main(String[] args) {
		D d=new D();
		d.methodA();
		d.methodD();
	}
}

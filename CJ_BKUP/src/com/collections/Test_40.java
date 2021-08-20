package com.collections;

public class Test_40 {

	int a;
	public Test_40() {
		System.out.println("Constructor");
	}
	{
		System.out.println("Non static block");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		new Test_40();
	}
}

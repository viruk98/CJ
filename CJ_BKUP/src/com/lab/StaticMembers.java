package com.lab;

public class StaticMembers {

	static  int x=5;  //static variable
	static {
		System.out.println("static block ::"+x);   //static block
	}
	
	static int add(int a, int b) {
		int c=a+b;								//static method
		return c;
	}
	public static void main(String[] args) {
		System.out.println(add(5, 5));
		x=10;
		System.out.println("changed static variable value  ::" +x);
	}
}

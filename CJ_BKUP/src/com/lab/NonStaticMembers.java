package com.lab;

public class NonStaticMembers {

	 int x=5;  //non-static variable
	
	
	 int add(int a, int b) {
		int c=a+b;								//non-static method
		return c;
	}
	public static void main(String[] args) {
		System.out.println(new NonStaticMembers().add(5, 5));
		System.out.println(new NonStaticMembers().x);
	int c=new NonStaticMembers().x=10;
		System.out.println("changed non static variable value  ::" +c);
	}
}

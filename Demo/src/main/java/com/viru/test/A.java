package com.viru.test;

public class A {

	int x,y;
	
	public static void main(String[] args) {
		A a1=new A();
		A a2= new A();

		a1.x=10;   a1.y=20;
		System.out.println(a1.x +" "+a1.y);

		a2=a1; 		//System.out.println(a2.x +" "+a2.y);
		a2.y=50;
		System.out.println(a1.x +" "+a1.y +" "+a2.y);
	}
}

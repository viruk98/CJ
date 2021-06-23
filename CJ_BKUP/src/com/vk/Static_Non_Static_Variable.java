package com.vk;

public class Static_Non_Static_Variable {
	static int a=0;
	int b=0;
	 
	public Static_Non_Static_Variable() {
		a++;
		b++;
		System.out.println("static variable " +a);
		System.out.println("initial variable " +b);
		System.out.println("------");
	}

	 void display() {
		 int a=10;
		System.out.println("acsessing static variable");
		System.out.println(Static_Non_Static_Variable.a);
		System.out.println(a);
		System.out.println(new Static_Non_Static_Variable().a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		new Static_Non_Static_Variable();
		
		new Static_Non_Static_Variable();
		
		new Static_Non_Static_Variable();

		System.out.println("-------");
		new Static_Non_Static_Variable().display();
	}
}

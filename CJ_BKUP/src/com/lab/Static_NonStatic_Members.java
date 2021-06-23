package com.lab;

public class Static_NonStatic_Members {


	static int x=5;  //static value

	int x1=22;  //instance variable (or) non-static variable
	static {
		System.out.println("static block ::"+x);   //static block
	//	System.out.println("non static variable ::"+x1); // cannot be accessed
	}

	static int add(int a, int b) {
		int c=a+b;								//static method
		System.out.println("from static block acessed non static variable " +new Static_NonStatic_Members().x1);
		return c;
	}
	
	static String add(String a,String b ) {
		
		String c=a+b;
		return c;
		
	}

	int multi(int a,int b) {

		int c=a*b;
		System.out.println("from non static multi method ::"+x);
		System.out.println("static variable using cls name in non static ::"+ Static_NonStatic_Members.x);
		return c;
	}
	public static void main(String[] args) {
		System.out.println(add(88,88));
		int c=new Static_NonStatic_Members().x1; //
		System.out.println(Static_NonStatic_Members.x);
		System.out.println("without using cls name acessing static variable ::"+x);
		System.out.println(c);

		System.out.println(new Static_NonStatic_Members().multi(9, 5)); //printing non static members
	}
}

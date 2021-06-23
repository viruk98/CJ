package com.string;

public class Test2 {

	static String helloName(String a,String b) {
		return '"'+a+b+b+a+'"';
	}
	public static void main(String[] args) {
		System.out.println( helloName("HI","Bye"));
	}
}

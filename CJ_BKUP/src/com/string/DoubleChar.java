package com.string;

public class DoubleChar {

	static String doubleChar(String str) {
		String s="";
		for (int i = 0; i < str.length(); i++) {
			s=s+str.charAt(i)+str.charAt(i);
		}
		return s;
		
	}
	public static void main(String[] args) {
		System.out.println( doubleChar("Java"));
	}
}

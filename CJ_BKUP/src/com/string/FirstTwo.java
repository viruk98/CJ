package com.string;

public class FirstTwo {

	static String firstTwo(String str) {
		if(str.length()<2) {
			return str;
		}
		else {
			String s;
		return s=str.substring(0,2);
		}
		
	}
	public static void main(String[] args) {
		System.out.println( firstTwo("hello"));
	}
}

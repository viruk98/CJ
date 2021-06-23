package com.string;

public class Test4 {

	static String extraEnd(String str) {
		String s=str.substring(str.length()-2);
		
		return s+s+s;
	}
	public static void main(String[] args) {
		System.out.println( extraEnd("hello"));
	}
}

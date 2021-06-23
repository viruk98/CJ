package com.jun2206;

public class ReverseString {

	public static void main(String[] args) {

		String s="rama";
		char ch=s.charAt(1);
		System.out.println(ch);
		for(int i=s.length();i>0;--i)                 
		{  
			System.out.print(s.charAt(i-1)); 
		}
	}
}

package com.array;

public class ReverseString {

	static void m1(String s) {
		
		char ch[]=s.toCharArray();
		for(int i=s.length();i>0;i--)                 
		{  
		System.out.print(s.charAt(i-1));              
		}  
	}
	public static void main(String[] args) {
		m1("king");
	}
}

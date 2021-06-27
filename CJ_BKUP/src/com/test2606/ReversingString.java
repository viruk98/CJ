package com.test2606;

public class ReversingString {
	public static void main(String[] args) {
		
	
	String org="king";

	char ch[]=org.toCharArray();
	for(int rev=org.length()-1;rev>=0;rev--) {
		
		System.out.print(ch[rev]);
	}
	}
}

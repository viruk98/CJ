package com.array;

public class VowelsInString {

	static void m1(String s) {
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch[]=s.toCharArray();
			
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'
					||s.charAt(i)=='i'|| s.charAt(i)=='o' 
					|| s.charAt(i)=='u') {
				count++;
			}
		}
		
		System.out.print("no of vowels :: "+count);
	}
	public static void main(String[] args) {
		m1("aeiou");
	}
}

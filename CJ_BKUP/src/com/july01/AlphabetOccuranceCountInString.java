package com.july01;

public class AlphabetOccuranceCountInString {
	
	static char MaxOccuranceChar(String s)
	{
		int c[]=new int[200];
		int l=s.length();
		for(int i=0;i<l;i++)
			c[s.charAt(i)]++;
			int max=-1;
			char result=' ';
		for(int i=0;i<l;i++) {
			if(max<c[s.charAt(i)]){
				max=c[s.charAt(i)];
				result=s.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String input="testing";
		System.out.println("input String "+input);
		System.out.println("max count in string "+MaxOccuranceChar(input));
	}
}

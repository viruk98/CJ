package com.july01;

public class CheckingLetterPresentOrNot {

	public static void main(String[] args) {
		String s="umbrella";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]=='e') 
			{
				System.out.println("e is Present");	
			}
		}
	}
}

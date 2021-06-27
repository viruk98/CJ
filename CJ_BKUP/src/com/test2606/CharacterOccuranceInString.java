package com.test2606;

public class CharacterOccuranceInString {

	public static void main(String[] args) {
		String s="kingkong";
		char letter='k';
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==letter)
				count++;
		}
		System.out.println(count);
	}
}

package com.logical;

import java.util.Scanner;

public class AlphabetOrNot {

	static void checkAlphaOrNot(char ch) {

		String res=((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90))
				?"Given "+ch+" is Alphabet"
				:"Given "+ch+" is not Alphabet";
		//String c=res.char;
		//return c;
	}

	public static void main(String[] args) {

		System.out.println("enter the character");
		Scanner sc=new Scanner(System.in);
		char c;
		c=sc.next().charAt(0);
		checkAlphaOrNot(c);
	}
}

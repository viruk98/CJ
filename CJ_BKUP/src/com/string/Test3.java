package com.string;

public class Test3 {

	static String makeOutWord(String out,String word) {
		return out.substring(0,2)+word+out.substring(2);
	}
	public static void main(String[] args) {
		System.out.println( makeOutWord("<<>>","Bye"));
	}
}

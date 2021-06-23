package com.lab;

public class Test3 {

	static void m1(int i) {
		if(i>=0) {
			m1(i-1);
			System.out.println(i);
		}
		//System.out.println(i);
	}
	public static void main(String[] args) {
		m1(2);
	}
}

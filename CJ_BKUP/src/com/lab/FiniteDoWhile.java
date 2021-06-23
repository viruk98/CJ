package com.lab;

public class FiniteDoWhile {
	public static void main(String[] args) {
		int j=0;
		int n=100;
		do {
			System.out.println(j++);
			if(j==5) 	break;
		} while (j<n);
	}
}

package com.lab;

public class PrintingAToZZToA {

	public static void main(String[] args) {

		for (char ch='a';ch<='z';ch++) {
			System.out.print(ch);

			System.out.println();

			for(char ch1='z';ch1>='a';ch1--) {
				System.out.print(ch1);
			}
		}
	}
}

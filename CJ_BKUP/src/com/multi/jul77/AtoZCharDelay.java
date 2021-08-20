package com.multi.jul77;

public class AtoZCharDelay {

	public static void main(String[] args) throws InterruptedException {

		char ch;
		for(ch='a';ch<='z';ch++) {
			Thread.sleep(1000);
			System.out.println(ch);
		}
	}
}

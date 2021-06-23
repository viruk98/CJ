package com.lab;

public class InfiniteForLoop {

	
	public static void main(String[] args) {
		
		/*
		 * int n=1; for (int i = 0; ; i++) { System.out.println(i); }
		 */
		
		int n=100;
		for (int i = 0;i<=n ; i++) {
			
			System.out.println(i);
			if(i==50)
				break;
		}
	}
}

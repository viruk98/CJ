package com.lab;

public class NestedForLoop {

	public static void main(String[] args) {

		
		for (int i=0; i<=10; i++) {
			System.out.print(i);
			
			System.out.println();
			
			for (int j = 10; j>=0;j--) {
				System.out.print(j);
			}
		}
	}
}

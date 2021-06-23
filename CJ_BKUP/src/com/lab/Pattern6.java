package com.lab;

public class Pattern6 {

	public static void main(String[] args) {
		int rows=5;
		for(int i=0;i<rows;i++) {
			for(int j=i;j<rows;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=2*i;j++) {
				if( j==0||j==2*i||i==0||i==rows-1)
					System.out.print("v");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

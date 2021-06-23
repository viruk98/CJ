package com.lab;

public class Pattern2 {

	public static void pattern(int n) {
		for (int i = 0; i<=n; i++) 
		{
			for (int j = n-i; j>1; j--) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern(5);
	}
}


//* * * * * 
//* * * *
//* * *  
//* * 
//* 

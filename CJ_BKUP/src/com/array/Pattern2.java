package com.array;

public class Pattern2 {
	static void m1(int n) {
		int i,j;
		for(i=0;i<n;i++) 
		{
			for(j=0;j<n;j++) 
			{
				if(i>=n-1 || j==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
		}
	}
	
	public static void main(String[] args) {
		m1(7);
	}

}

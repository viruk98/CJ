package com.lab;

public class OuterTrianglePattern {
	
	static void triangle()
	{
		int row,col;
		for(row=1;row<5;row++) {
			for(col=1;col<8;col++) {
				if(row==4 || row+col==5 || col-row==3) 
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		triangle();
		//for n=3
		System.out.println("------------------");
		triangle(4);
	}

	static void triangle(int n)
	{
		int row,col;
		for(row=0;row<n;row++) {
			for(col=0;col<n;col++) {
				if(row==n-1 || row+col==1 || col-row==1) 
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

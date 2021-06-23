package com.lab;

public class Pattern4
{
	public static void main(String[] args)
	{
		int rows = 5;
		for (int i = 1; i <= rows; i++) 
		{ 
			for (int j = rows; j > i; j--)
			{
			System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
			System.out.print("v");
			}
			System.out.println();

		}
	}
}

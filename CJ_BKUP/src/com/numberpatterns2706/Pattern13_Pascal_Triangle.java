package com.numberpatterns2706;

public class Pattern13_Pascal_Triangle {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			int c=1;
			for(int k=1;k<=i;k++) 
			{
				System.out.print(c+" ");
				c=k+n%c;
			}
			System.out.println();
		}
	}
}

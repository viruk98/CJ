package com.lab;

public class NameInStar {

	static void letterV(int n) {
		int i,j;
		for(i=n-1;i>=0;i--) {
			for(j=n-1;j>i;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(j=1;j<(i*2);j++)
			{
				System.out.print(" ");
			}
			if(i>=1)
				System.out.print("*");
			System.out.print("\n");
		}
		System.out.println();
	}

	static void letterI(int n)
	{
		int i, j;
		for (i = 0; i < n; i++) {
			System.out.println("      *");
		}
		System.out.println();
	}

	static void letterR(int n) {
		for(int i=0;i<=n;i++)     
		{
			for(int j=0;j<=n;j++)     
			{
				if (j == 1 || ((i == 0 || i == 3) && j > 1 && j < 5) ||
						(j == 5 && i != 0 && i < 3) || (j==i-1 && i > 2))   
					System.out.print("*");
				else      
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		System.out.println();
	}
	static void  letterU(int n) {
		for(int i=0;i<n;i++)    
		{
			for(int j=0;j<n;j++)      
			{    
				if (((j == 1 || j == 5) && i != 6) ||
						(i == 6 && j > 1 && j < 5)) 
					System.out.print("*"); 
				else      
					System.out.print(" "); 
			}
			System.out.print("\n");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int n=7;
		letterV(n);
		letterI(n);
		letterR(n);
		letterU(n);
	}
}

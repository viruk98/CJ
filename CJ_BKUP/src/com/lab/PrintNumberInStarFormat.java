package com.lab;

import java.util.Scanner;

public class PrintNumberInStarFormat {

	static void numberZero(int n) {
		int i,j;
		for (i = 0; i <n; i++) {
			for (j = 0; j <n; j++) {
				if(i==0||j==0||i==n-1||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------------");
		System.out.println();
	}
	static void numberOne(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for(j=0;j<n;j++) {
				if (/* i==n-1 || j==n/2 || */(i>0 && i<=n && j==n/2-i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		System.out.println();
	}

	static void numberTwo(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for(j=0;j<n;j++) {
				if (i == 0 ||i==n/2 ||i==n-1||(j==0 && i>=3)||(j==n-1 && i<=3))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------------");
		System.out.println();
	}
	
	static void numberEight(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for(j=0;j<n;j++) {
				if(i==0||i==n/2||i==n-1||j==0||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	static void numberSeven(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for(j=0;j<n;j++) {
				if (i == 0 ||(i==n/2 && j>2) ||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------------");
		System.out.println();
	}
	static void numberSix(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for(j=0;j<n;j++) {
				if (i == 0||i==n/2||i==n-1||j==0||(j==n-1&&i>=3))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	static void numberFive(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for(j=0;j<n;j++) {
				if (i == 0||i==n/2||i==n-1||(j==0&&i<=n/2)||(j==n-1&&i>=n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void numberFour(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for(j=0;j<n;j++) {
				if (j==n-1 || (j==0 && i<=n/2) || i==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void numberThree(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for(j=0;j<n;j++) {
				if (i == 0 ||i==n/2 ||i==n-1 ||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------------");
		System.out.println();
	}
	static void numberNine(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for(j=0;j<n;j++) {
				if (j==n-1 ||i==0 || (j==0 && i<=n/2) || i==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n=7;
		System.out.println("enter the number you want to print in pattern form ::");
		Scanner sc1=new Scanner(System.in);
		int i=sc1.nextInt();
		switch (i) {
		case 0:
			numberZero(n);
			break;
		case 1:
			numberOne(n);
			break;
		case 2:
			numberTwo(n);
			break;
		case 3:
			numberThree(n);
			break;
		case 4:
			numberFour(n);
			break;
		case 5:
			numberFive(n);
			break;
		case 6:
			numberSix(n);
			break;
		case 7:
			numberSeven(n);
			break;
		case 8:
			numberEight(n);
			break;
		case 9:
		numberNine(n);
			break;
		case 10:
			numberOne(n);numberZero(n);
			break;

		default:System.out.println("Invalid Number");
			break;
		}	
	}
}

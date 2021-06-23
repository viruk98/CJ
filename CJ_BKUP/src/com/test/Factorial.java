package com.test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num ;
        long factorial = 1;
        System.out.println("enter number");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        for(int i = 1; i <= num; i++)
        {
            
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    
	}
}
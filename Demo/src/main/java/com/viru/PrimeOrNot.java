package com.viru;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int num=sc.nextInt();
		int i=1;
		int count=0;
		while(i<=num) {

			//System.out.println();
			//System.out.println("c= "+count);
			//System.out.println("i= "+i);
			//System.out.println();
			if(num%i==0) {
				count++;
			}
			i++;
		}
		//System.out.println();
		//System.out.println(count);
		//System.out.println(i);
		if(count==2) 
			System.out.println("prime"+num);
		
		else
			System.out.println("Not Prime"+num);
		
		//String s="gopi";
		//System.out.println(s.substring(1,3));
		
		
	}

	
}

package com.jun2506;

import java.util.Scanner;

public class KnowingNumber {

	static void kABYN() {
		int a,i,p=0,n=0,o=0,e=0,z=0;
		for(i=1;i<=20;i++) {
			System.out.println("enter your number");
			Scanner sc= new Scanner(System.in);
			a=sc.nextInt();
			
			if(a>=0)
				p++;
			if(a<0)
				n++;
			if(a%2==0)
				e++;
			if(a%2!=0)
				o++;
			if(a==0)
				z++;
			
		}
		System.out.println("positive numbers "+p);
		System.out.println("negative numbers "+n);
		System.out.println("even numbers "+e);
		System.out.println("odd numbers "+o);
		System.out.println("zero numbers "+z);
		
	}
	public static void main(String[] args) {
		kABYN();
	}
}

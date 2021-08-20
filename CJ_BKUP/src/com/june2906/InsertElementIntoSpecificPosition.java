package com.june2906;

import java.util.Scanner;

public class InsertElementIntoSpecificPosition {

	static void insertElementAtIndex(int a[],int b,int pos) {
		a[b]=pos;
		for(int newVal:a)
		{
			System.out.println(newVal);
		}
	}
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		System.out.println("Enter the index number where you want to insert");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		System.out.println("enter the new value");
		int pos=sc.nextInt();
		System.out.println("new array");
		insertElementAtIndex(a, b, pos);
	}
}

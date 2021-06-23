package com.test;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a=10, b=20;  
		System.out.println("before swapping" +"a="+a+" b= "+b);      
		a=a+b;//a=30 (10+20)    
		b=a-b;//b=10 (30-20)    
		a=a-b;//a=20 (30-10)   
		System.out.println("before swapping" +"a="+a+" b= "+b);      
	}
}

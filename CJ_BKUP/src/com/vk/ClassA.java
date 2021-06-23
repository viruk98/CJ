package com.vk;

public class ClassA {

	void display(int a, int b, int c) {
		if(a>=b) {
			if(a>=c) 
				System.out.println("A is greater than b");
			else
				System.out.println("c is biggest");
		}	
		else {
			
		if(b>=c)
			System.out.println("b is big");
		else 
			System.out.println("c is big");
		}	
	}
	public static void main(String[] args) {
		new ClassA().display(30, 30, 20);
	}
}

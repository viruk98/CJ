package com.collections;

public class MainMethodOverLoading_54 {

	public static void main(String[] args) {
		
		MethodOverLoadingExample obj=new MethodOverLoadingExample();
		obj.add(10,5);
		obj.add(1,5,2);
	}
}
class MethodOverLoadingExample{
	

	public void add(int num1, int num2) {
		int result1=num1+num2;
		System.out.println("Result of first method : "+result1);
	}
	public void add(int num1, int num2,int num3) {
		int result2=num1+num2+num3;
		System.out.println("Result of first method : "+result2);
	}
}

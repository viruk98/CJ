package com.array;

public class SwapNumbersWithoutUsing3Variable {


	public static void main(String[] args) {
		int a=20,b=30;
		a=a+b; //50
		b=a-b; //50-30  =20
				a=a-b;
		System.out.println(a +" "+ b);
	}
}

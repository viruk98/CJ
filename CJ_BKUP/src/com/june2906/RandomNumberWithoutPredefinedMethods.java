package com.june2906;

public class RandomNumberWithoutPredefinedMethods {


public RandomNumberWithoutPredefinedMethods() {
	
}
	public static void main(String[] args) {

		RandomNumberWithoutPredefinedMethods a=new RandomNumberWithoutPredefinedMethods();
		int sum=0;
		for(int i=0;i<=50;i++) {
			if(i%2==0) {
				if(sum<15)
				{
					sum=sum+(i/2);
					System.out.println(sum);
				}
			}
		}
	}
}

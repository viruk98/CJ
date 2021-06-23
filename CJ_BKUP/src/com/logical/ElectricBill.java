package com.logical;

import java.util.Scanner;

public class ElectricBill {
	
	static void calculateBill(int units)
	{
		double totalAmount;
		double surCharge;
		if(units<=50)
		{
			totalAmount=(units*0.50);
			System.out.println("Electric Bill for this month for "+units+ " units is :"+totalAmount );
		}
		else if(units>50 && units<=150) 
		{
		totalAmount=(units*0.75);	
		System.out.println("Electric Bill for this month for "+units+ " units is :"+totalAmount );
		}
		else if(units>150 && units<=250) 
		{
		totalAmount=(units*1.20);	
		System.out.println("Electric Bill for this month for "+units+ " units is :"+totalAmount );
		}
		else if(units>250) 
		{
		totalAmount=(units*1.50);
		 surCharge = ((totalAmount*20)/100);	
		 totalAmount=surCharge+totalAmount;
		System.out.println("Electric Bill for this month for "+units+ " units is :"+totalAmount );
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter no of units you have used");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		calculateBill(n);
	}

}

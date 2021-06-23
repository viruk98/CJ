package com.logical;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args)
	{

		float basic_salary,da,hra,grossSalary;

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter Basic Salary Of Employee: ");
		basic_salary=scan.nextFloat();

		if(basic_salary<=10000) {
//			hra=(20*basic_salary)/100;
//			da=(80*basic_salary)/100;
//			grossSalary=hra+da+basic_salary;
			grossSalary=2*basic_salary;
			System.out.println("Gross Salary Of Employee: "+ grossSalary);
		}
		else if(basic_salary>10000 && basic_salary<=20000) {
			hra=(25*basic_salary)/100;
			da=(90*basic_salary)/100;
			grossSalary=hra+da+basic_salary;
			System.out.println("Gross Salary Of Employee: "+ grossSalary);
		}
		else {
			hra=(35*basic_salary)/100;
			da=(95*basic_salary)/100;
			grossSalary=hra+da+basic_salary;
			System.out.println("Gross Salary Of Employee: "+ grossSalary);
		}
	}
}

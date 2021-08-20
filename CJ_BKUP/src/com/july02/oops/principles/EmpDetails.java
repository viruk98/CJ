package com.july02.oops.principles;

public class EmpDetails {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.seteName("viru");
		e.setDesg("CEO");
		e.setDob("7/7/1998");
		System.out.println("Employee name :"+e.geteName());
		System.out.println("Employee desg :"+e.getDesg());
		System.out.println("Employee dob :"+e.getDob());
	}
}

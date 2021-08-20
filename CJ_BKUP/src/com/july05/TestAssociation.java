package com.july05;

public class TestAssociation {

	public static void main(String[] args) {
		
	
	Bank bank=new Bank("rbi");
	Company company=new Company();
	company.setCompanyName("VK_Solutions");
	System.out.println(company.getCompanyName()+" uses this bank for transactions "+bank.getName());
	}
}

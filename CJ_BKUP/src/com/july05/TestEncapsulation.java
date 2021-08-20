package com.july05;

public class TestEncapsulation {

	public static void main(String[] args) {
		Company c= new Company();
		c.setCompanyCeo("vk");
		c.setCompanyId(143);
		c.setCompanyNo(9858576);
		c.setCompanyType("software");
		c.setCompanyName("vk_Solutions");
		System.out.println("company details");
		System.out.println("company name :"+c.getCompanyName());
		System.out.println("company id   :"+c.getCompanyId());
		System.out.println("company ceo  :"+c.getCompanyCeo());
		System.out.println("company type :"+c.getCompanyType());
		System.out.println("company no   :"+c.getCompanyNo());
	}
}

package com.july05;

public class SingleInheritanceSbi extends RBI {

	@Override
	public void bank() {
		System.out.println("sbi loan");
	}
	@Override
	public void loan() {
		System.out.println("sbi loans");
	}
	@Override
	public void interest() {
		System.out.println("sbi loan interest");
	}
	@Override
	public void location() {
		super.location();
	}
	
	public void employee() {
		System.out.println("sbi employee");
	}
	public static void main(String[] args) {
		
	SingleInheritanceSbi s= new SingleInheritanceSbi();
	
	s.bank();
	s.loan();
	s.interest();
	s.location();
	}
}

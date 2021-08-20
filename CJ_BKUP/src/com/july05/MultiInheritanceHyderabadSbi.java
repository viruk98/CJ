package com.july05;

public class MultiInheritanceHyderabadSbi extends SingleInheritanceSbi{

	@Override
	public void bank() {
		System.out.println("Sbi Hyderbad Bank");
	}
	@Override
	public void location() {
		super.location();
		System.out.println("State Hyderabad");
	}
	public static void main(String[] args) {
		 
		MultiInheritanceHyderabadSbi m=new MultiInheritanceHyderabadSbi();
		m.bank();
		m.location();
		m.interest();
		m.employee();
	}
}

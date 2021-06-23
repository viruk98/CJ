package in.hdfcmain.net;

import in.hdfcblogic.net.BankAccount;


public class Bank {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		
		System.out.println("account balance");
		acc1.currentBalance();
		acc1.depoist(10000);
		
		acc1.currentBalance();
		System.out.println("account balance");
		acc2.currentBalance();
		acc2.depoist(70000);
		
		acc2.currentBalance();
	}

}

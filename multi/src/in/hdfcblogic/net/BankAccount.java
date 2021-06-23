package in.hdfcblogic.net;

public class BankAccount {

	private double balance;
	
	public void depoist(double amt) {
		this.balance=this.balance+amt;
		System.out.println("sucessfully deposited");
	}
	
	public void withdraw(double amt) {
		this.balance=this.balance+amt;
		System.out.println("withdraw done sucessfully");
	}
	
	public void currentBalance() {
		System.out.println(balance);
	}
}

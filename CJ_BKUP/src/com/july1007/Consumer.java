package com.july1007;

public class Consumer extends Thread{
	
	private Market market;
	private int n;
	
	public Consumer(Market m,int n) {
		this.market=market;
		this.n=n;
	}
	public void run() {
		int a=0;
		for(int i=0;i<10;i++) {
			a=market.get();
			System.out.println("consumer purchased"+this.n+"no of items :"+a);
		}
	}
}

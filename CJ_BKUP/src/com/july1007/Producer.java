package com.july1007;

public class Producer extends Thread {
	private Market market;
	private int n;

	public Producer(Market m,int n) {
		this.market=market;
		this.n=n;
	}
	public void run() {
		int a=0;
		for(int i=0;i<10;i++) {
			a=market.get();
			System.out.println("Producer produced"+this.n+"no of items :"+a);
		}
		try {
			Thread.sleep(1000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}


}

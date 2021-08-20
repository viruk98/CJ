package com.multi.jul77;

public class DeadLockEx {
	public static void main(String[] args) {  
		final String v1 = "king";  
		final String v2 = "queen";  
		Thread t1 = new Thread() {  
			public void run() {  
				synchronized (v1) {
					System.out.println("thread 1 method 1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (v2) {
						System.out.println("thread 1 method 2");
					}
				} 
			}  
		};

		Thread t2=new Thread() {
			public void run() {
				synchronized(v2) {
					System.out.println("thread 2 method 2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (v1) {
						System.out.println("thread 2 method 1");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}
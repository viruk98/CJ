package com.july1007;

public class DeadLock_3 {

	public static void main(String[] args) {

		final String s1="king";
		final String s2="queen";
		Thread t1=new Thread() {
			public void run() {
				synchronized (s1) {
					System.out.println("s1 :m11");
					try {
						Thread.sleep(1000);
					}
					catch (Exception e) {
						e.printStackTrace();
					}

					synchronized (s2) {
						System.out.println("s2 : m12");
					}
				}
			}
		};
		Thread t2=new Thread() {
			public void run() {
				synchronized (s2) {
					System.out.println("s2 :m21");
					try {
						Thread.sleep(1000);
					}
					catch (Exception e) {
						e.printStackTrace();
					}

					synchronized (s1) {
						System.out.println("s2 : m22");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}

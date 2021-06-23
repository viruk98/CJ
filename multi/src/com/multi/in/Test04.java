
package com.multi.in;

public class Test04 extends Thread{

	@Override
	public void run() {
		System.out.println("in run method");

		System.out.println("get name"+ Thread.currentThread());
	}

	
	public static void main(String[] args) throws InterruptedException {


		System.out.println("in Main");
		Thread t1=new Test04();
		t1.start();
		Thread.currentThread().join();
		t1.setName("king");
		//t1.sleep(10000);
		System.out.println("get name"+ Thread.currentThread());
	}
}



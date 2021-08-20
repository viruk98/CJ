package com.multi.jul77;

public class Test1 extends Thread{

	public void run() {
		System.out.println("run method");
	}
	public static void main(String[] args) throws InterruptedException {
		 Test1 a=new Test1();
		 Thread t1=new Thread(a);
		 t1.start();
		 t1.join();
		 for(int i=1;i<=5;i++) {
			 System.out.println("for loop method");
			 Thread.sleep(1000);
		 }
		 t1.interrupt();
		 System.out.println(a.isAlive());
	}
}

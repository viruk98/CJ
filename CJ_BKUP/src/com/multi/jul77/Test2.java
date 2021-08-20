package com.multi.jul77;

public class Test2 extends Thread{

	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("run method");
			
			try {
				System.out.println("thread will sleep");
				Test2.sleep(1000);
				System.out.println("thread sleep done");
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Test2 t2= new Test2();
		System.out.println(t2.isAlive());
		System.out.println("getState1"+t2.getState());
		t2.start();
		System.out.println(t2.isAlive());
		System.out.println("thread name"+t2.getName());
		System.out.println("thread priority"+t2.getPriority());
		System.out.println("thread state"+t2.getState());
	}
}

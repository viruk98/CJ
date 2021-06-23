package com.multi.in;

public class Test03 extends Thread{
	@Override
	public void run() {
		System.out.println("run-method");
	}
	
public static void main(String[] args) {
		
		Test03 t=new Test03();
		//mt1.start();
		Thread t1=new Test03();
		System.out.println("after thread");
		t1.start();
		System.out.println("end-method");
	}
}

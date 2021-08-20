package com.multi.jul77;

public class ThreadCreationWay1 extends Thread {

	public void run() {
		System.out.println("run method");
	}
	public static void main(String[] args)  {
		ThreadCreationWay1 t= new ThreadCreationWay1();
		t.start();
	}
}

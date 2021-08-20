package com.multi.jul77;

public class ThreadCreationWay2 implements Runnable {

	
	public static void main(String[] args)  {
		ThreadCreationWay2 t= new ThreadCreationWay2();
		Thread t1=new Thread(t);
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("run method");
	}
}

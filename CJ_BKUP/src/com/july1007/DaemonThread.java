package com.july1007;

public class DaemonThread extends Thread
{
	public DaemonThread(String name) {
		super(name);
	}
	@Override
	public void run() {
 
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+"Is daemon Thread");
		}
		else {
			System.out.println(getName()+"is not daemon Thread");
		}
	}

	public static void main(String[] args) {
		DaemonThread d1=new DaemonThread("a");
		DaemonThread d2=new DaemonThread("d1");
		DaemonThread d3=new DaemonThread("d3");
		d1.setDaemon(true);
		d1.start();
		d2.start();
		d3.setDaemon(true);
		d3.start();
	}
}

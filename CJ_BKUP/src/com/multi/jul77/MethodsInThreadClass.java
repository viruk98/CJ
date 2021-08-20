package com.multi.jul77;

public class MethodsInThreadClass {

	private boolean runn=true;

	//final MethodsInThreadClass m=new MethodsInThreadClass();
	public void start() {
		System.out.println("inside start method");
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("inside run method");
				try {
					Thread.sleep(1000);
				}
				catch (Exception e) {
					Thread.currentThread().interrupt();
				}
				synchronized (MethodsInThreadClass.this) {
					runn=false;
					MethodsInThreadClass.this.notify();
				}
			}
		});
		t1.start();
		t1.setName("start");
		t1.setPriority(10);
		System.out.println(t1);
	}

	public void join() throws InterruptedException {
		System.out.println("in join method");
		synchronized (this) {
			while(runn) {
				wait();
			}
		}
		System.out.println("join method completed");
	}

	public void print(String s) {
		System.out.println(s);
	}

	public void run() {
		for(int i=0;i<5;i++) {
			Thread.yield();
			System.out.println("Thread Started "+Thread.currentThread().getName());
		}
		System.out.println("Thread Ended "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) throws InterruptedException {
		MethodsInThreadClass m= new MethodsInThreadClass();
		
		System.out.println("main");
		m.run();
		for(int i=0;i<5;++i) {
			System.out.println("thread started "+Thread.currentThread().getName());
		}
		m.start();
		
		m.join();
		
	}
}

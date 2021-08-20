package com.july1007;

public class Market {

	private int goods;
	private boolean available=false;
	public synchronized int get() {
		while(available==false) {
			try {
				wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notifyAll();
		return goods;
	}
	public synchronized void put() {
		while(available==true) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		available=true;
		notifyAll();
		
	}
}

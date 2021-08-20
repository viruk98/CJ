package com.july1007;


public class ProducerConsumer_2 {

	public static void main(String[] args) {
		Market m=new Market();
		Producer p=new Producer(m,1);
		Consumer c=new Consumer(m,2);
	}
}

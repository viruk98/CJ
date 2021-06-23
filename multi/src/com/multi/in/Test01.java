package com.multi.in;


class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("run start" + getName());
		for(int i=1 ;i<=20 ;i++) {
			System.out.println(getName() +" run : "+ i);
		}
		System.out.println("run end "+ getName() );
	}
}
public class Test01 {

	public static void main(String[] args) {
		
		MyThread mt1=new MyThread();
		//mt1.start();
		MyThread mt2=new MyThread();
		mt1.start();
		mt2.start();
	}

}

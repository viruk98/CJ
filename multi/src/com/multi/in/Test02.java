package com.multi.in;


class MyThread2 extends Thread{
	private int x;
	
	public MyThread2(int x) {
		this.x=x;
	}
	@Override
	public void run() {
		System.out.println("run start" + getName());
		for(int i=1 ;i<=x ;i++) {
			System.out.println(getName() +" run : "+ i);
		}
		System.out.println("run end "+ getName() );
	}
}
public class Test02 {

	public static void main(String[] args) {
		
		MyThread2 mt1=new MyThread2(4);
		//mt1.start();
		MyThread2 mt2=new MyThread2(10);
		mt1.start();
		mt2.start();
	}

}

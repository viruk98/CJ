package com.viru;
/*
 * With_Out return Statement Program Execution Flow
 */

class Program_Flow{
	void m1(){			//m3
		Program_Flow obj1=new Program_Flow();
		obj1.m5();
		int a=10;
		System.out.println(10);
		System.out.println(54+a);
	}
	void m2(){     			//m5
		int a=20;
		System.out.println(78-a);
	}
	void m3(){ 					//main
		//int a=30;
		Program_Flow obj1=new Program_Flow();
		System.out.println(89+1);
		obj1.m1();
		System.out.println(10);
	}

	void m4(){
		//int a=10;
		System.out.println(89);
	}

	void m5(){		//m1
		System.out.println(77);
		Program_Flow obj1=new Program_Flow();
		obj1.m2();
		System.out.println(99);
	}

	public static void main(String[] args) {
		System.out.println("start");
		Program_Flow obj1=new Program_Flow();
		obj1.m3();
		System.out.println("end");
	}


}
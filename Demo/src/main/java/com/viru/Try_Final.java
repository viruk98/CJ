package com.viru;

public class Try_Final {

	public static void main(String[] args) {

		System.out.println("main start");
		m1();
		System.out.println("main end");
	}
	static void m1(){

		//System.out.println("m1 start");
		try {
			System.out.println("In-try");
			System.out.println( 10/2);
			System.out.println( 10/0);
			
		}catch (ArithmeticException e) {
			e.printStackTrace();
		} 

		finally {
			System.out.println("In-Finally");
			return ;
		}

		//System.out.println("");
	}

}


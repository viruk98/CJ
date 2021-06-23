package com.lab;
public class Test22Super {
		//static int x = m1();
		static int  m2() {
			System.out.println("Test22 : m2() called");
		return 10;
		}
		
	}
	class Test22Sub extends Test22Super {
		static int x ;
		static int m1() {
			System.out.println("Test22 : m1() called");
		return 20;
		}
		public static void main(String[] args){
			System.out.println("X : "+x);
		} 
	}


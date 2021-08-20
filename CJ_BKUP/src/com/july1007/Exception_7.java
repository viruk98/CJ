package com.july1007;

public class Exception_7 {

	public static void main(String[] args) {
		
		System.out.println("main");
		try {
			
			try {
				int a=1;
				int b=a/0;
				} catch (Exception e) {
					e.printStackTrace();			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			System.out.println("finlly block");
		}
	}
}

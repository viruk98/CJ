package com.july1007;

public class Exception_6 {

	public static void main(String[] args) {
		
		try {
		int a=1/0;
		throw new CustomException("can not divide by zero");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}

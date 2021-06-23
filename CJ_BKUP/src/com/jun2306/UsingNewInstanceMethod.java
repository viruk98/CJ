package com.jun2306;

import java.lang.reflect.Constructor;

//using new instance method of constructor
public class UsingNewInstanceMethod {
	int n;
	String s;
	public UsingNewInstanceMethod(int n,String s) {
		this.s=s;
		this.n=n;
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		try {
			Constructor<UsingNewInstanceMethod> constructor=
					            UsingNewInstanceMethod.class.getDeclaredConstructor();
			UsingNewInstanceMethod method=constructor.newInstance();
			
			System.out.println(method.n);
			System.out.println(method.s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

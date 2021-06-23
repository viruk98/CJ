package com.viru.test;

import com.viru.Static_Interface;

public class Static_Interface_Test implements Static_Interface {

	public static void main(String[] args) {
		Static_Interface.hello();
	int a=Static_Interface.add(40, 50);
	int b=Static_Interface.product(50, 60);
	System.out.println(a +" :: "+ b);
	}
}

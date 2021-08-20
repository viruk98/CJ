package com.collections;

public class MainClass_50 {

	public static void main(String[] args) {
		Y.staticMethod();
	}
}
class  X{
	static void staticMethod() {
		System.out.println("Class X");
	}
}

class Y extends X{
	static void staticMethod() {
		System.out.println("Class Y");
	}
}
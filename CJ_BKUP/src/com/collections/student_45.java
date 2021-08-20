package com.collections;

class Laptop {

	void access() {
		System.out.println("Copy java soft copies....");
	}
}
class Faculty{
	static Laptop password=new Laptop();
}
public class student_45{
	public static void main(String[] args) {
		Faculty.password.access();
	}
}
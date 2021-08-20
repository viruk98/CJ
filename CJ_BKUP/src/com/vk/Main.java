package com.vk;

class A { 
	public A(int i) {
		System.out.println(1); 
	}
	public A() { 
		this(10);
		System.out.println(2); 
	}
	void A() {
		A(10); 
		System.out.println(3);
	} 
	void A(int i) { 
		System.out.println(4);
	} 
} 
class Main {
	public static void main(String[] args) { 
		new A().A();
 	} 
}


//class A{
//	public void method1()
//	{
//		System.out.println("Method1 in class A");
//	}
//}
//class B extends A{
//	public void method1()
//	{
//		System.out.println("Method1 in class B");
//	}
//	public void method2()
//	{
//		System.out.println("Method2 in class B");
//	}
//}
//public class Main { 
//	public static void main(String[] args) {
//		A a= new B();
//		a.method1();
//	}
//}
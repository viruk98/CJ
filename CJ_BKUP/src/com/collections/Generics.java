package com.collections;

public class Generics {

	public static void main(String[] args) {
		B b=new B();/* Line A*/
		C c=b.process(new C()); /*Line B*/
		B<C> b2=new B<C>();  /*Line c*/
		C c2=b2.process(new C());/* Line D*/
	}
}

interface A{
	int count();
	void show();
}

class B<T extends A>{
	T process(T t) {
		t.count();
		t.show();
		return t;
	}
}

class C implements A{
	public int count() {return 25;}
	public void show() {System.out.println("Class C");}
}
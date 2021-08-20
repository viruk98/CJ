package com.collections;

public class UseGenerics {
	
	public static void main(String[] args) {
		MyGen<Integer> m=new MyGen<Integer>();
		m.set("merit");
	}
}
class MyGen<T>{
	T var;
	void set(T var) {
		this.var=var;
	}
	T get()
	{
		return var;
	}
}

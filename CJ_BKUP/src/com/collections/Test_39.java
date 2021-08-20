package com.collections;

public class Test_39 {

	public static void main(String[] args) {
		Gen g=new Gen(100);
		Gen g1=new Gen(121.5f);
		g.show();
		g1.show();
	}
}

class Gen{
	private double val;
	<Object extends Number>Gen(Object ob){
		val=ob.doubleValue();
	}
	void show() {
		System.out.println(val);
	}
}
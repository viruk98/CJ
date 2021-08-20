package com.collections;

public class GenericsWithObjectDemo_31 {

	public static void main(String[] args) {
		GenericsWithObjects<Double> doubleObject=new
				GenericsWithObjects<>(12.0);
		doubleObject.print();
	}
}

class GenericsWithObjects<Double>
{
	Double obj;
	GenericsWithObjects(Double obj)
	{
		this.obj=obj;
	}
	void print() {
		System.out.println(obj);
	}
}
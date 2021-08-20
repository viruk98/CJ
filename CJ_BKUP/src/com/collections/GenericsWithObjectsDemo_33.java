package com.collections;


public class GenericsWithObjectsDemo_33 {

	public static void main(String[] args) {
		GenericsWithObject<Integer> floatObject=new
				GenericsWithObject<>(12);
		floatObject.print();
	}
}

class GenericsWithObject<Integer>
{
	int obj;
	GenericsWithObject(int obj)
	{
		this.obj=obj;
	}
	void print() {
		System.out.println(obj);
	}
}
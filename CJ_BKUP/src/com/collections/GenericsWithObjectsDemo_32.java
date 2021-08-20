package com.collections;

public class GenericsWithObjectsDemo_32 {

	public static void main(String[] args) {
		GenericsWithObjectss<Float> floatObject=new
				GenericsWithObjectss<>(33.0F);
		floatObject.print();
	}
}

class GenericsWithObjectss<Float>
{
	Float obj;
	GenericsWithObjectss(Float obj)
	{
		this.obj=obj;
	}
	void print() {
		System.out.println(obj);
	}
}
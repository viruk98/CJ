package com.collections;
public class GenericsWithObjectsDemo_36 {

	public static void main(String[] args) {
		GenericsWithObject2<Integer> doubleObject=new
				GenericsWithObject2<>(12);
		doubleObject.print(); 
		GenericsWithObject2<String> stringObject=new
				GenericsWithObject2<>("MeritCampus");
		stringObject.print();
	}
}

class GenericsWithObject2<Integer>
{
	Integer obj;
	GenericsWithObject2(Integer obj)
	{
		this.obj=obj;
	}
	void print() {
		System.out.println(obj);
	}
}
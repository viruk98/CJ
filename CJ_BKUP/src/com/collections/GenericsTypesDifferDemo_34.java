package com.collections;

public class GenericsTypesDifferDemo_34 {

	public static void main(String[] args) {
		GenericsWithObject<Integer> integerObject=new
				GenericsWithObject<>(12);
		GenericsWithObject1<String> stringObject=new
				GenericsWithObject1<>("MeritCampus");
		integerObject=stringObject; //Line A
		integerObject.print(); //Line B
	}
}

class GenericsWithObject1<Integer>
{
	Integer obj;
	GenericsWithObject1(Integer obj)
	{
		this.obj=obj;
	}
	void print() {
		System.out.println(obj);
	}
}
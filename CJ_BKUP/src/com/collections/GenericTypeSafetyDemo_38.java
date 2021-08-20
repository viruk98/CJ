package com.collections;

public class GenericTypeSafetyDemo_38 {

	public static void main(String[] args) {
		NonGeneric1 obj1= new NonGeneric1(88);
		NonGeneric1 obj2= new NonGeneric1("MeritCampus");
		obj1=obj2;
		int value=(Integer)obj1.getOb();
	}
}

class NonGeneric1{
	Object ob;
	NonGeneric1(Object ob) {
		this.ob=ob;
	}
	Object getOb() {
		return ob;
	}
}
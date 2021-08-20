package com.collections;

public class GenericTypeSafetyDemo_37 {

	public static void main(String[] args) {
		NonGeneric obj1= new NonGeneric(88);
		obj1.showType();
		NonGeneric obj2= new NonGeneric("MeritCampus");
		obj2.showType();
		
	}
}

class NonGeneric{
	Object ob;
	 NonGeneric(Object ob) {
		 this.ob=ob;
	}
	 void showType() {
		 System.out.println("Type is :"+ob.getClass().getName());
	 }
}
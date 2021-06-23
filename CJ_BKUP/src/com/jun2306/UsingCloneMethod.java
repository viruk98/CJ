package com.jun2306;

public class UsingCloneMethod implements Cloneable{
	
	int n;
	String s;
	public UsingCloneMethod(int n,String s) {
		this.s=s;
		this.n=n;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		UsingCloneMethod obj1=new UsingCloneMethod(77,"viru");
		
		UsingCloneMethod one =	(UsingCloneMethod) obj1.clone();
		System.out.println("Object one ");   
		System.out.println("number = " + obj1.n);   
		System.out.println("string = " + obj1.s);
System.out.println();
		System.out.println("cloned one ");   
		System.out.println("string = " + one.s);
		System.out.println("number = " + one.n);   
	}

}

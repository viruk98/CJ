package com.array;

public class t1 {
public t1() {
System.out.println("0-param")
;}
	
	public static void main(String[] args) {
		String s1=new String("abc");
		String s2=new String("abc");
		String s3=s1+s2;
		String s4=new String("abcabc");
		String s5=s3;
		 System.out.println(s1==(s2));
		System.out.println(s2==s1);
		System.out.println(s3==(s5));
		System.out.println(s4==(s3));
		System.out.println(s5==s4);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
	}
}

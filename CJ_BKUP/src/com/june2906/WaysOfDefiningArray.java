package com.june2906;

public class WaysOfDefiningArray {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		int b[]= {1,2,3,4,5};
		
		int[] c= {1,2,3,4,5};
		
		int[] d= {1,2,3,4,5};
		
		int e[]; e= new int[5];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		for(int i=0;i<a.length;i++) {
			System.out.println("element at index"+ i +" : "+a[i]);
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.println("element at index"+ i +" : "+b[i]);
		}
		for(int f:c) {
			System.out.println(f);
		}
	}
}

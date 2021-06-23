package com.logical;

public class Even {

	static void even(int n) {
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i +",");
			}	
		}
	}

	public static void main(String[] args) {
		int n=20;
		even(n);
	}
}

package com.jun2206;

public class PrimeOrNot {


	static void checkPrime(int n) {
		boolean flag = false;
		if(n==0||n==1){  
			System.out.println(n+" is not prime number");      
		}
		else{  
			for(int i=2;i<=n/2;i++) {
				System.out.println();
				if(n%i==0) {
					System.out.println("even");
					flag=true;
					break;
				}	
				else
					System.out.println("odd");
			}
			if(!flag)
				System.out.println("prime");
			else
				System.out.println("not prime");
		}
	}
	public static void main(String[] args) {

		checkPrime(20);
		//int i=2,n=0;
		System.out.println((0%2));
	}
}

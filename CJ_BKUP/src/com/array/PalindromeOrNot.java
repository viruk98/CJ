package com.array;

public class PalindromeOrNot {
	static void m1(int n) {
		
		int r,sum = 0,temp;
		temp=n;
		while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		}
		if(temp==sum)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
		
	}
	public static void main(String[] args) {
		m1(121);
	}

}

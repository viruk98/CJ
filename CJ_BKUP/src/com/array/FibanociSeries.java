package com.array;

public class FibanociSeries {

	static void m1(int n) {
		//0+1+1+2+3+5+8+13+21
		
		int n1=0,n2 = 1 ;
		int total=0;
		
		while(total<=n)
		{
			int	 sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(n1 +" ");
			
			total++;	
		}
		
	}
	public static void main(String[] args) {
		m1(10);
	}
}

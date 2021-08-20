package com.numberpatterns2706;

public class Pattern12 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int c=i;
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");
				 c=c+n;
			}
			System.out.println();
		}//System.out.println(1<=1);
	}

}

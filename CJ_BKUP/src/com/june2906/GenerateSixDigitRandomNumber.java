package com.june2906;

public class GenerateSixDigitRandomNumber {

	public static void main(String[] args) {
		
		long time=System.currentTimeMillis();
		String s1=String.valueOf(time); 
		char[] a=s1.toCharArray();
		for(int i=6;i<s1.length()-1;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		
		long t=System.nanoTime();
		String string=String.valueOf(t);
		//System.out.println(string);
		char[] ch=string.toCharArray();
		for(int i=9;i<string.length()-1;i++)
		{
			System.out.print(ch[i]);
		}
	}
}

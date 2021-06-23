package com.array;

import java.util.Scanner;

public class PalindromeString {

	 public static void main(String args[])
	 {
	     int n,i;
	     boolean flag=false;
	 String s;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the string");
	 s=sc.nextLine();
	 char str[]=s.toCharArray();
	     
	 n=str.length;
	     for(i=0;i<n;i++)
	     {
	       if(str[i]!=str[n-i-1])
	         {
	             flag=true;
	             break;
	         }
	     }
	        	if(flag==true)
	        	{
	             System.out.println("YES");
	        	}
	         else
	        	{
	             System.out.println("NO");
	        	}   
	 }
}

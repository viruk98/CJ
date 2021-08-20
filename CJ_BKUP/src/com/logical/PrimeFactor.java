package com.logical;

public class PrimeFactor {

	static void printDivisors(int n)
    {
        for (int i=2;i<n;i++)
            if (n%i==0)
                System.out.print(i+" ");
    }
 
     public static void main(String args[])
    {
    	 int n = 100;
        System.out.println("The divisors of " +n+ " are: ");
        printDivisors(n);;
    }
}

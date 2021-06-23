package com.junit3.test;

import com.junit3.beans.Calculator;


import junit.framework.Assert;
import junit.framework.TestCase;



	public class CalculatorTest extends TestCase {
 
		int a;
		int b;
		int expectedSum;
		Calculator calculator;
		
		@SuppressWarnings("deprecation")
		public void testAdd() {
			a=10;
			b=20;
			int actualSum=30;
			expectedSum =30;
			calculator =new Calculator();
			actualSum=calculator.add(a,b);
			Assert.assertEquals(expectedSum, actualSum);
			}
	}
	


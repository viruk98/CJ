package com.jun2206;

public class StackOverFlowProgram {
	public Two two;
	public StackOverFlowProgram() {
		two=new Two();
	}
	
	public static void main(String[] args) {
		StackOverFlowProgram maiin=new StackOverFlowProgram();
	}
	
	
	class Two {
	    public StackOverFlowProgram one;
	    public Two()
	    {
	       one = new StackOverFlowProgram();
	    }

	}
}

package com.collections;

import java.util.Stack;

public class SampleDemo_35 {

	public static void main(String[] args) {
		
		Sample<Integer> obj=new Sample<>();
		obj.push(36);
		System.out.println(obj.pop());
	}
}

class Sample<Integer>
{
	Stack<Integer> ob=new Stack<Integer>();
	
	public void push(Integer obj) {
		ob.push(obj);
	}
	public Integer pop() {
		Integer obj=ob.pop();
		return obj;
	}
	
}
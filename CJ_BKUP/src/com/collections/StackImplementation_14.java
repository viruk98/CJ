package com.collections;

import java.util.Stack;

public class StackImplementation_14 {

	public static void main(String[] args) {
		Stack<String> bag=new Stack();
		bag.push("java"); bag.push(" ");
		bag.push("learn"); bag.push(" ");
		bag.push("you"); bag.push(" ");
		bag.push("campus"); bag.push(" ");
		bag.push("merit"); bag.push(" ");
		bag.push("in"); bag.push(" ");
		System.out.println(bag.peek());
		if(!bag.empty()) {
			System.out.println(bag.pop());
		}
		System.out.println("\n"+bag.search("java"));
	}
}

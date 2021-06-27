package com.test;

import java.util.Stack;

public class Paranthesis {

	public static boolean isValid(String s) {

		boolean isBalance = true;
		Stack stack = new Stack ();
		try {
			for (char ch: s.toCharArray()) {
				if (ch == '(' || ch == '{' || ch == '['){
					stack.push(ch);
				}
				else {
					Character top = (Character) stack.pop();
					if ((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '['))
						continue;
					else {
						isBalance = false;
						break;
					}
				}
			}
			if (!stack.isEmpty())
				isBalance = false;
		} catch (Exception ex) {
			isBalance = false;
		}
		return isBalance;
	}

	public static void main(String args[]){
	System.out.println(	isValid("[]{}"));
	}
}


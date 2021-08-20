package com.collections;

import java.util.LinkedList;

public class PushPop_13 {

	private LinkedList list= new LinkedList();
	public void	push(Object v) {
		list.add(v);
	}
	public Object pop() {
		return list.removeFirst();
	}
	public Object top() {
		return list.getFirst();
	}
	public static void main(String[] args) {
		
		PushPop_13 stack=new PushPop_13();
		for(int i=40;i>=30;i--) {
			stack.push(new Integer(i));
			System.out.println(stack.top()+" ");
			System.out.println(stack.pop()+" ");
			stack.push(10);
			System.out.println(stack.top());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		}
		
	}
}

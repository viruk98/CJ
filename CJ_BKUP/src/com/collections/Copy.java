package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Copy {
 
	public static void main(String[] args) {
		
		List<String> list1=new ArrayList();
		list1.add("M");
		list1.add("E");
		List<String> list2=list1;
		list1.add("R");
		list1.add("I");
		list1.add("T");
		System.out.format("%s", list1);
		System.out.format("%s", list2);
	}
}

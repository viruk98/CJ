package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CollectionVector {

	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		vector.add("one");
		vector.add("two");
		vector.add("three");
		vector.add("four");
		System.out.println("Original vector :"+vector);
		List<String> list=new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("five");
		vector.addAll(list);
		System.out.println("After adding all :"+vector);
	}
}

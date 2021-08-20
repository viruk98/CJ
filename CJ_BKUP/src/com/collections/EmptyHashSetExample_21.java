package com.collections;

import java.util.HashSet;

public class EmptyHashSetExample_21 {

	public static void main(String[] args) {
		//create a hashset
		HashSet<String> hset=new HashSet<String>();
		hset.add("Element1");
		hset.add("Element2");
		hset.add("Element3");
		hset.add("Element4");
		hset.add("Element5");
		System.out.println("Before HashSet Contains"+hset);
		hset.clear();
		System.out.println("After clearing HashSet Contains"+hset);
	}
}

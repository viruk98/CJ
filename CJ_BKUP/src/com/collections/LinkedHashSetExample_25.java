package com.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample_25 {

	public static void main(String[] args) {
		//linkedHashSet of string type
		LinkedHashSet<String> lhset=new LinkedHashSet<>();
		//adding elements to the linkedHashSet
		lhset.add("Z");
		lhset.add("PQ");
		lhset.add("N");
		lhset.add("O");
		lhset.add("KK");
		lhset.add("FGH");
		System.out.println(lhset);
		//linkedHashSet of Integer Type
		LinkedHashSet<Integer> lhset2=new LinkedHashSet<Integer>();
		//Adding elements
		lhset2.add(99);
		lhset2.add(7);
		lhset2.add(0);
		lhset2.add(67);
		lhset2.add(89);
		lhset2.add(66);
		System.out.println(lhset2);
		
	}
}

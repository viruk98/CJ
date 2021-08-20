package com.collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class CollectionProgram2 {

	public static void main(String[] args) {
		
		Vector<String> vector=new Vector<>();
		Enumeration<String> strs=null;
		vector.add("merit");
		vector.add("campus");
		vector.add("to");
		vector.add("you");
		vector.add("welcomes");
		vector.add(" ");
		vector.add("becomes");
		vector.add("a");
		vector.add("good");
		vector.add("");
		vector.add("programmer");
		strs=vector.elements();
		System.out.println(vector.indexOf("merit"));
		Collections.swap(vector,2,4);
		while(strs.hasMoreElements() && !vector.isEmpty()) {
		System.out.println(strs.nextElement());
		}
	}
}

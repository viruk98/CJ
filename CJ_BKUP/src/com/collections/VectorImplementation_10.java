package com.collections;

import java.util.Vector;

public class VectorImplementation_10 {

	public static void main(String[] args) {
		
		Vector vect=new Vector();
		vect.add("one");
		vect.add("two");
		vect.add("three");
		vect.add("five");
		vect.insertElementAt("Numbers In Words", 0);
		vect.insertElementAt("four", 4);
		for(int i=0;i<vect.size();i++) {
			System.out.println(vect.elementAt(i));
		}
		vect.removeElement("five");
		System.out.println("\nsize :"+vect.size());
		System.out.println(vect);
	}
}

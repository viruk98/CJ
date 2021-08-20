package com.collections;

import java.util.Collections;
import java.util.Vector;

public class BinarySearch_12 {

	public static void main(String[] args) {
		Vector<String> characters=new Vector<String>();
		characters.add("M");
		characters.add("E");
		characters.add("R");
		characters.add("I");
		characters.add("T");
		Collections.reverse(characters);
		Collections.sort(characters);
		int position=Collections.binarySearch(characters, "I"); //returns index
		System.out.println("characters found at :"+position);
	}
}

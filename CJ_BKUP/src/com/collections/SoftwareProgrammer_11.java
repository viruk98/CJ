package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class SoftwareProgrammer_11 {

	public static void main(String[] args) {
		Enumeration seasons;
		Vector<String> v=new Vector<>();
		v.add("winter");
		v.add("spring");
		v.add("rainy");
		seasons=v.elements();
		v.add("summer");
		while(seasons.hasMoreElements()) {
			System.out.println(seasons.nextElement());
		}
	}
}

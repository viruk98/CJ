package com.collections;

import java.util.HashMap;

public class HashMapExample_23 {

	public static void main(String[] args) {
		//create a HashMap
		HashMap<Integer,String> hmap=new HashMap<Integer, String>();
		//adding few elements
		hmap.put(11, "jack");
		hmap.put(22, "rock");
		hmap.put(33, "rick");
		hmap.put(44, "smith");
		hmap.put(55, "will");
		System.out.println("HashMap contains :"+hmap);
		//creating a new HashMap
		HashMap<Integer,String> hmap2=new HashMap<Integer,String>();
		hmap2=(HashMap)hmap.clone();
		System.out.println("Cloned Map contains"+hmap2);
	}
}

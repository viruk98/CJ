package com.collections;

import java.util.HashMap;

public class HashMapIsEmptyExample_22 {

	public static void main(String[] args) {
		//create a HashMap
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		//checking whether HashMap is empty or not
		System.out.println("Is HashMap Empty ?"+hmap.isEmpty());
		//adding few elements
		hmap.put(11, "jack");
		hmap.put(22, "rock");
		hmap.put(33, "rick");
		hmap.put(44, "smith");
		hmap.put(55, "will");
		//checking again
		System.out.println("Is hashMap empty ?"+hmap.isEmpty());
	}
}

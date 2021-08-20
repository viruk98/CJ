package com.collections;

import java.util.Hashtable;

public class HashSearch_17 {

	public static void main(String[] args) {
		Hashtable<String,String> hm= new Hashtable<>();
		hm.put("A", "1");
		hm.put("B", "2");
		hm.put("C", "3");
		if(hm.containsValue("A")) {
			System.out.println("the hashtable contains the value");
		}
		else {
			System.out.println("the hashtable does not contain values");
		}
		if(hm.containsValue("2")) {
			System.out.println("the hashtable contains value");
		}
		else {
			System.out.println("the hashtable does not contains value");
		}
	}
}

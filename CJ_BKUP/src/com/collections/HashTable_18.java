package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

public class HashTable_18 {

	public static void main(String[] args) {
		Hashtable<String,String> hashtable=new Hashtable<String,String>();
		hashtable.put("first", "1");
		hashtable.put("two", "2");
		hashtable.put("thrid", "3");
		hashtable.put("thrid", "3");
		hashtable.put("five", "5");
		hashtable.put("six", "6");
		System.out.println(hashtable);
		List<String> list= new ArrayList<String>(hashtable.keySet());
		Collections.sort(list);
		for(String key:list) {
			System.out.println(key+"->"+hashtable.get(key));
		}
	}
}

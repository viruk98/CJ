package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Test_19 {

	public static void main(String[] args) {
		Map hashMap=new HashMap(); 
		Map weakHashMap=new WeakHashMap();
		String keyHashMap=new String("map");
		String keyWeakHashMap=new String("WeakHashMap");
		hashMap.put(keyHashMap, "merit");
		weakHashMap.put(keyWeakHashMap, "campus");
		System.gc();
		System.out.println(hashMap.get("Map")+" "+weakHashMap.get("WeakHashMap"));
		keyHashMap=null;
		keyWeakHashMap=null;
		System.gc();
		System.out.println(weakHashMap.get("WeakHashMap")+" "+hashMap.get("Map"));
	}
}

package com.collections;

import java.util.Dictionary;
import java.util.Hashtable;

public class TouchMe_16 {

	public static void main(String[] args) {
		Dictionary<Integer, String> d=new Hashtable<Integer, String>();
		d.put(1, "mobile");
		d.put(2, "laptop");
		d.put(3, "Desktop");
		d.put(4, "notebook");
		System.out.println(d.get("1")+",");
		System.out.println(d.get("2")+",");
		System.out.println(d.get("3")+",");
		System.out.println(d.get("4")+",");
	}
}

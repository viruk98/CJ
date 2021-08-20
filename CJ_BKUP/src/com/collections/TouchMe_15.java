package com.collections;

import java.util.Dictionary;
import java.util.Hashtable;

public class TouchMe_15 {

	public static void main(String[] args) {
		Dictionary<Integer, String> d=new Hashtable<Integer, String>();
		d.put(1, "mobile");
		d.put(2, "laptop");
		d.put(3, "Desktop");
		d.put(4, "notebook");
		for(int i=1;i<=4;i++) {
			System.out.println(d.get(i)+" ,");
		}
		
	}
}

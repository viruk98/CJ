package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddCollection2 {
	public static void main(String[] args) {
	
		List<String> list=new ArrayList<String>();
		Collections.addAll(list, "c","c++","c#","java");
		System.out.println(list);
		String[] strs= {"net","unix"};
		Collections.addAll(list, strs);
		System.out.println(list);
	//	Collections.addAll(list,list);
		System.out.println(list);
	}

}

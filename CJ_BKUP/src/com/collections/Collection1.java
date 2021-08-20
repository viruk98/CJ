package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		Collections.addAll(list, "C","C++","C#","Java");
		System.out.println(list);
		String[] str= {".net","UNIX"};
		Collections.addAll(list, str);
		System.out.println(list);
		
		Collections.addAll(list);
		System.out.println(list);
	}
}

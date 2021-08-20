package com.collections;

import java.util.AbstractMap;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Wonder_20 {

	private enum Gender{
		M,F;
	}
	public static void main(String[] args) {
		printSize(new HashMap<Gender,Gender>());
		printSize(new EnumMap<Gender,Gender>(Gender.class));
	}
	
	public static void printSize(Map<Gender,Gender> map) {
		map.put(Gender.M, Gender.F);
		map.put(Gender.F, Gender.M);
		map.put(Gender.M, Gender.M);
		map.put(Gender.F, Gender.F);
		Set<Map.Entry<Gender,Gender>> set=new HashSet<Map.Entry<Gender,Gender>>(map.entrySet());
		for(Map.Entry<Gender, Gender> e:map.entrySet()) {
			set.add(new AbstractMap.SimpleEntry<Gender,Gender>(e.getKey(),e.getValue()));
		}
		System.out.println(set.size());
	}
}

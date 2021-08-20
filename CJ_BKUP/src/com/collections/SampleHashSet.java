package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SampleHashSet {

	public static void main(String[] args) {
		//creating a hashset
		Set<String> eduCourses=new HashSet<>();
		//adding new elements to the hashset
		eduCourses.add("Big Data");
		eduCourses.add("Node.js");
		eduCourses.add("Java");
		eduCourses.add("Python");
		eduCourses.add("BlockChain");
		eduCourses.add("JavaScript");
		eduCourses.add("Selenium");
		eduCourses.add("AWS");
		eduCourses.add("Machine Learning");
		eduCourses.add("RPA");
		
		//adding duplicate elements will be ignored
		
		eduCourses.add("Java");
		eduCourses.add("RPA");
		System.out.println(eduCourses);
		//check if hashset contains an specific element
		String myCourse="node.js";
		if(eduCourses.contains(myCourse)) {
			System.out.println(myCourse+" is in the course list");
		}
		else {
			System.out.println(myCourse+" is not in the courses list");
		}
		List<String> list=new ArrayList<String>(eduCourses);
		Collections.sort(list);
		//printing the sorted elements of the Hashset
		System.out.println("printing the courses in the soretd order using list"+list);
		
		eduCourses.remove("Python");
		//Iterating over hashSet Items
		System.out.println("Iterating over course list after removing Python");
		Iterator<String> i=eduCourses.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		//creating another object of hashset
		HashSet<String> eduNewCourses=new HashSet<String>();
		eduNewCourses.add("Node.js");
		eduNewCourses.add("Python");
		eduNewCourses.add("Machine Learning");
		//Removing all the new elements from Hashset
		eduCourses.removeAll(eduNewCourses);
		System.out.println("after invoking removeAll() method courses left :"+eduCourses);
		
		//removing elements on the basis of specified condition
		eduCourses.removeIf(str->str.contains("java"));
		System.out.println("After invoking removeIf() method :"+eduCourses);
		
		//Removing elelments from eduCourses which are specified in edunewCourses
		eduCourses.retainAll(eduNewCourses);
		System.out.println("Hashset after "+"retainAll() operation :"+eduNewCourses);
	
		//removing all the elements available in the set
		eduCourses.clear();
		System.out.println("After invoking clear() method :"+eduCourses);
	}
}

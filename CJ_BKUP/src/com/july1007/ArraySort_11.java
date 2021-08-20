package com.july1007;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySort_11  {

	public static void main(String args[]){
		ArrayList<Encap> arraylist = new ArrayList<Encap>();
	   arraylist.add(new Encap(999, "kk", "268414141"));
	   arraylist.add(new Encap(505, "vkk", "245455"));
	   arraylist.add(new Encap(452, "aa", "365565652"));

	   
	   System.out.println("Student Name Sorting:");
	   Collections.sort(arraylist, Encap.StuNameComparator);

	   for(Encap str: arraylist){
			System.out.println(str);
	   }

	   
	   System.out.println("RollNum Sorting:");
	   Collections.sort(arraylist, Encap.getNo());
	   for(Encap str: arraylist){
			System.out.println(str);
	   }
	}
}
package com.collections;

import java.util.ArrayList;
public class DemoOnLists {

	public static void main(String[] args) {
		ArrayList<Integer> myList=new ArrayList<>();
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++)
				myList.add(i*j);
		}
		for(Integer value:myList) {
			System.out.println(value);
		}
	}
}

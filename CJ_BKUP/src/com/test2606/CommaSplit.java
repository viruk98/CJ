package com.test2606;

public class CommaSplit {
	public static void main(String[] args) {
		String s="ok , good";
		String[] sp=s.split("[,]",0);
		for(String str:sp)
		System.out.println(str);
	}

}

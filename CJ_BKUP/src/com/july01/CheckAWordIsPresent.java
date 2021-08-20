package com.july01;

public class CheckAWordIsPresent {

	public static void main(String[] args) {
	
		String s="This is Orange juice";
		String[] sarray=s.split(" ",'1');
		
		for(int i=0;i<sarray.length-1;i++) {
			if(sarray[i].equalsIgnoreCase("OraNge"))
			System.out.println("orange is present");
		}
		
	}
}

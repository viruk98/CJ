package com.array;

public class DuplicatesInString {

	static void removeDuplicates(String input){
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    System.out.println(result);
	}
	public static void main(String[] args) {
		
	removeDuplicates("ababa");
	
	String s="viru";
	
		
 }

}

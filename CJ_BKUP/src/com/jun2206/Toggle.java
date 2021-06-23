package com.jun2206;

public class Toggle {

	public static void main(String args[]){
	      String sample = "Hello How are you";
	      String[] words = sample.split(" ");
	      System.out.println(words[3]);
	      String result = "";
	      for(String word:words){
	         String firstSub = word.substring(0, 1);
	         String secondSub = word.substring(1);
	         result = result+firstSub.toLowerCase()+secondSub.toUpperCase()+" ";
	      }
	      System.out.println(result);
	   }
}

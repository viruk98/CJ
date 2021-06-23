package com.viru.test;

public class WordsInString {
	public static void main(String args[]) {
		String string = "Paper is a thin sheet material produced by mechanically or chemically processing cellulose fibres derived from wood, rags, grasses or other vegetable sources in water, draining the water through fine mesh leaving the fibre evenly distributed on the surface, followed by pressing and drying. Although paper was originally made in single sheets by hand, almost all is now made on large machines—some making reels 10 metres wide, running at 2,000 metres per minute and up to 600,000 tonnes a year. It is a versatile material with …";
		String s1="Paper is a thin sheet material produced by mechanically or chemically processing cellulose fibres derived from wood, rags, grasses or other vegetable sources in water, draining the water through fine mesh leaving the fibre evenly distributed on the surface, followed by pressing and drying. Although paper was originally made in single sheets by hand, almost all is now made on large machines—some making reels 10 metres wide, running at 2,000 metres per minute and up to 600,000 tonnes a year. It is a versatile material with …";
		String s2=s1.concat(string);
		String word = "is";
		String temp[] = s2.split(" ");
		int count = 0;
		for (int i =0; i<temp.length;i++) {
			if (word.equals(temp[i]))
				count++;
		}
		String s="hello one . two three";
		String p[]=s.split(" ");
		System.out.println(p.length);
		
		System.out.println(word + " occurs " + count + " times in the above string");
	}
}
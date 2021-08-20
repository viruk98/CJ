package com.july01;

public class STrim {

	public static void main(String[] args) {
		
//		String s=" abc ";
//		System.out.println(s.trim());
		
//		String s1=" a";
//		System.out.println(s1.isBlank()); //false
//		
//		String s2=" ";
//		System.out.println(s2.isBlank()); //true
//		
//		String s3="";
//		System.out.println(s3.isEmpty()); //true
//		
//		String s4=" abc";
//		System.out.println(s4.isEmpty() );//false
//		
//		String s5="abc";
//		System.out.println(s5.endsWith("c")); //true
//		
//		String s6="aaa";
//		System.out.println(s6.endsWith("c")); //false
//		
//		String s7="ant";
//		System.out.println(s7.startsWith("a")); //true
//		
//		String s8="ant";
//		System.out.println(s8.startsWith("n")); //false
//		
//		String s9="king";
//		System.out.println(s9.contains("ki")); //true
//		
//		String s10="king";
//		System.out.println(s10.contains("ko")); //false
//		
//		String s11="kong";
//		System.out.println(s11.compareToIgnoreCase("gun"));//true
//		
//		String s12="king";
//		System.out.println(s12.replace('i', 'o')); //replaces the old char with new char
//	
//		String s13="kinga";
//		System.out.println(s13.replaceAll(s13, "a")); //replaces all the chars in the string
//		
//		String s14="  aabb";
//		System.out.println(s14.strip());
//		
//		 String s15 = String.join("-", "Java", "is", "cool");
//		 System.out.println(s15);
//		
//		String s16=" aa bb ";
//		System.out.println(s16.stripLeading());
//		System.out.println(s16.stripTrailing());
//		
//		String s17="hello";
//		System.out.println(s17.hashCode());
//		String s18="hello";
//		System.out.println(s18.hashCode());
		
		String s19="abcd";
		System.out.println(s19.indexOf('b', 0)); 
		
		String s20="rani";
		System.out.println(s20.codePointCount(0, 2));
	}
}

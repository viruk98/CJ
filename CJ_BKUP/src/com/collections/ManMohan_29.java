package com.collections;

public class ManMohan_29 {

	public static void main(String[] args) {
		MyClassB<Integer,StringBuilder> obj=new 
				MyClassB<Integer,StringBuilder>(new StringBuilder("MERIT"));
		System.out.println(obj.myMethod());
	} 
}

@SuppressWarnings("hiding")
class MyClassA<String>{
	String s;
	public MyClassA(String str) {
		s=str;
	}
	public String getS() {
		return s;
	}
}

class MyClassB<Integer,StringBuilder> extends MyClassA<StringBuilder>{//Line A
	public MyClassB(StringBuilder v) {
		super(v);
	}
	
	public String myMethod() {
		StringBuilder input=getS();
		String inputString=input.toString();
		String result="";
		for(int i=inputString.toCharArray().length;i>0;i--) {
			int ch=inputString.toLowerCase().toCharArray()[i-1];
			int newNumber=0;
			while(ch>0) {
				newNumber =newNumber*10+ch%10;
				ch=ch/10;
			}
			result=result+((char)(newNumber/65)+66);
		}
		return result;
	}
}


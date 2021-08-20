package com.july01;

public class ProgramToCountSpecialChars {

	public static void main(String[] args) {

		String s="aeiou xyz 11";
		//String[] sarray=s.split(" ",'1');
		char[] ch=s.toCharArray();
		int vowelCount=0;
		int specialCount=0;
		int numberCount=0;
		int consonentCount=0;
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]>='a' && ch[i]<='z')
					|| (ch[i]>='A' && ch[i]<='Z'))
			{
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') 
				{
					vowelCount++;
					//System.out.println(vowelCount);
				}
				else
				{
					consonentCount++;
					//System.out.println(consonentCount);
				}
			}
			else if(ch[i]>='0'&& ch[i]<='9')
			{
				numberCount++;
				//System.out.println(numberCount);
			}
			else 
				specialCount++;
			//System.out.println();
		}
		System.out.println(numberCount);
		System.out.println(vowelCount);
		System.out.println(consonentCount);
		System.out.println(specialCount);
	}
}

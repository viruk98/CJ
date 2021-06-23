package com.jun2306;

public class UsingNewInstance {

	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class cls=Class.forName("UsingNewInstance");
		UsingNewInstance obj1=(UsingNewInstance) cls.newInstance();
		System.out.println(obj1);
	}
}

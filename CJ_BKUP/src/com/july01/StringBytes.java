package com.july01;

import java.util.Arrays;

public class StringBytes {

	public static void main(String[] args) {
		String s="java";
		byte[] barray;
		barray=s.getBytes();
		System.out.println(Arrays.toString(barray));
	}
}

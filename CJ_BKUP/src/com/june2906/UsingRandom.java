package com.june2906;

import java.util.Random;

public class UsingRandom {

	static int rangeIn() {
		Random rad=new Random();
		int out=rad.nextInt(5);
		return out;
	}
	public static void main(String[] args) {
		int a=rangeIn();
		System.out.println(a);
	}
}

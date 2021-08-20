package com.july02.oops.principles;

public class NormalVechileTest {

	public static void main(String[] args) {
		VechileFactory vf=new  Normal();
		
		vf.engine();
		vf.type();
		vf.start();
		vf.run();
		vf.stop();
	}
}

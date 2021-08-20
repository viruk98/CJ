package com.july02.oops.principles;

public abstract class VechileFactory {

	abstract void start();
	abstract void stop();
	abstract void run();
	abstract void engine();
	abstract void type();
	
	void show() {
		System.out.println("abstract class");
	}
}

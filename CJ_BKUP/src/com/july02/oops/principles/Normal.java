package com.july02.oops.principles;

public class Normal extends VechileFactory {

	@Override
	void start() {
		System.out.println("indicates to start vechile");
		
	}

	@Override
	void stop() {
		System.out.println("indicates to stop vechile");
	}

	@Override
	void run() {
		System.out.println("in moving state");
		
	}

	@Override
	void engine() {
		System.out.println("150cc-pertrol engine");		
	}

	@Override
	void type() {
		System.out.println("normal vechile");
	}

	

}

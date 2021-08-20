package com.july02.oops.principles;

public class Hen implements Animal,Bird{
	
		@Override
		public void fly() {
			System.out.println("a little distance");
		}

		@Override
		public void eat() {
			System.out.println("eat lite food");
		}

		@Override
		public void sound() {
			System.out.println("kukurku");
		}
	
}

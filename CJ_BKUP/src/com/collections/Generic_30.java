package com.collections;

@SuppressWarnings("hiding")
public class Generic_30<Integer> {

	private Integer t;
	public void set(Integer t) {
		this.t=t;
	}
	public Integer get() {
		return t;
	}
	
	public<Integer extends Number> void inspect(String string) {
		System.out.println("T :"+ t.getClass().getName());
		System.out.println("U :"+string.getClass().getName());
	}
	
	public static void main(String[] args) {
		Generic_30<java.lang.Integer> integerBox=new Generic_30<>();
		integerBox.set(10);
		integerBox.inspect(new String("12"));
	}
	
}

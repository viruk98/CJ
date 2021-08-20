package com.collections;

public class ShadowTest_48 {

	public int x=0;
	class FirstLevel{
		public int x=1;
		void methodInFirstLevel(int x) {
			System.out.println("x="+x);
			System.out.println("this.x="+this.x);
			System.out.println("ShadowTest_48.this.x="+ShadowTest_48.this.x);
		}
	}
	public static void main(String[] args) {
		ShadowTest_48 st=new ShadowTest_48();
		ShadowTest_48.FirstLevel fl=st.new FirstLevel();
		fl.methodInFirstLevel(23);
	}
}

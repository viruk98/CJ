package com.collections;

public class MultiLevelInheritanceMain_53 {

	protected String str;
	public MultiLevelInheritanceMain_53() {
		str="This";
	}
	public static void main(String[] args) {
		ChildClass3 obj=new ChildClass3();
		obj.diplay();
	}
}

class ChildClass1 extends MultiLevelInheritanceMain_53{
	
	public ChildClass1() {
		str=str.concat("is");
	}
}

class ChildClass2 extends ChildClass1{
	
	public ChildClass2() {
		str=str.concat("multilevel Inheritance");
	}
}

class ChildClass3 extends ChildClass2{
	
	public ChildClass3() {
		str=str.concat("Example");
	}
	void diplay() {
		System.out.println(str);
	}
}
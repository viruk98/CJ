package com.collections;

public class EncapsulationDemo_51 {

	public static void main(String[] args) {
		Main obj=new Main();
		obj.setName("xyz");
		obj.setAge(45);
		obj.setSerialNum(456);
		System.out.println("Employee Name :"+obj.getName());
		System.out.println("Employee Serial number :"+obj.getSerialNum());
		System.out.println("Employee age :"+obj.getAge());
	}
}
class Main{
	private int serialNum;
	private String name;
	private int age;
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
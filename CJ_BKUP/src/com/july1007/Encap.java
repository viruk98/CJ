package com.july1007;

public class Encap {

	private int no;
	private String name;
	private String pphoneNo;
	public Encap(int no, String name, String pno) {
        this.no = no;
        this.name = name;
        this.pphoneNo = pno;
    }
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPphoneNo() {
		return pphoneNo;
	}
	public void setPphoneNo(String pphoneNo) {
		this.pphoneNo = pphoneNo;
	}
}

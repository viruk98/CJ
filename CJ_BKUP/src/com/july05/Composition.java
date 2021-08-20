package com.july05;

import java.util.ArrayList;
import java.util.List;

public class Composition {

	public static void main(String[] args) {
		Bank s=new Bank("sbi");
		Bank h=new Bank("hdfc");
		Bank i=new Bank("icici");
		List<Bank> b=new ArrayList<>();
		b.add(s);
		b.add(h);
		b.add(i);
		for(Bank a: b)
			System.out.println(a.getName());
	}
}

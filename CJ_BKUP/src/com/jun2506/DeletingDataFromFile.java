package com.jun2506;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DeletingDataFromFile {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw=new PrintWriter("o.txt");
		
		BufferedReader br=new BufferedReader(new FileReader("i.txt"));
		
		String s=br.readLine();
		
		while(s!=null) {
			boolean flag=false;
			
		}
	}
}

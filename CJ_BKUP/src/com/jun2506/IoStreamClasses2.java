package com.jun2506;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoStreamClasses2 {
	public static void main(String[] args) throws IOException {
		FileReader in=null;
		FileWriter os=null;
		try {
			in=new FileReader("i.txt");
			os=new FileWriter("o1.txt");
			int copy;
			while ((copy=in.read())!=-1) {
				os.write(copy);			
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(in!=null) {
				in.close();
			}
			if(os!=null) {
				os.close();
			}
		}
	}
}
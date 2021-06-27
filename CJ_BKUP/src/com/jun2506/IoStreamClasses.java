package com.jun2506;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStreamClasses {
	public static void main(String[] args) throws IOException {
		FileInputStream in=null;
		FileOutputStream os=null;
		try {
			in=new FileInputStream("i.txt");
			os=new FileOutputStream("o.txt");
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
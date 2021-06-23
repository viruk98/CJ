package com.jun2306;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable   
{   
	public int i;   
	public String s;   
	public A(int i, String s) 
	{   
		this.i = i;   
		this.s = s;   
	}     
} 
public class UsingDeserialization{

	public static void main(String[] args) {

		String filename ="file.txt";
		//serialization
		try {
			A obj1=new A(77, "viru");
			FileOutputStream fos=new FileOutputStream(filename);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.close();
			fos.close();
			System.out.println("object Serialized");
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		//==================================================================================

		A obj = null;   
		//Deserialization
		try  
		{      
			FileInputStream file = new FileInputStream(filename);  
			ObjectInputStream is = new ObjectInputStream(file);   
			obj = (A)is.readObject();        
			is.close();                    
			file.close();                   
			System.out.println("Object deserialized ");   
			System.out.println("number = " + obj.i);   
			System.out.println("string = " + obj.s);   
		}   
		catch(IOException e1)   
		{   
			e1.printStackTrace();  
		}   
		catch(ClassNotFoundException e)   
		{   
	e.printStackTrace();		
		}  
	}   
}  
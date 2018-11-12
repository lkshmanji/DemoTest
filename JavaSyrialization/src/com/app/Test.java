package com.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws IOException {
		
		
		Student s=new Student(101, "lakshman", "bhopal");
 
		FileOutputStream fos=new FileOutputStream("Student.pdf/txt/doc");
	ObjectOutputStream ous=new ObjectOutputStream(fos);
	
	ous.writeObject(s);
	ous.flush();
	System.out.println("inserted succsefully");
	
	}

}

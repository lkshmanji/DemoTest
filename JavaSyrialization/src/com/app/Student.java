package com.app;

import java.io.Serializable;

public class Student implements Serializable{
	
	int sid;
	String name;
	String address;
	public Student(int sid, String name, String address) {
		
		this.sid = sid;
		this.name = name;
		this.address = address;
	}

}

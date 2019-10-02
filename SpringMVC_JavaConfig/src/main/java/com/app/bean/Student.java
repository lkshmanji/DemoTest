package com.app.bean;

import java.util.List;

public class Student {


	private int sid;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", password=" + password + ", address="
				+ address + ", gender=" + gender + ", course=" + course + ", timing=" + timing + "]";
	}
	
	private String name;
	
	private String email;
	
    private String password;

	private String address;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getGender() {
		return gender;
	}
	public void setGender(List<String> gender) {
		this.gender = gender;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	public List<String> getTiming() {
		return timing;
	}
	public void setTiming(List<String> timing) {
		this.timing = timing;
	}
	
	private List<String> gender;
	
	private List<String> course;

	private List<String > timing;
	
}

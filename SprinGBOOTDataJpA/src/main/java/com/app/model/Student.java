package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "st101")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "nationality", nullable = false)
	private String nationality;

	@Column(name = "code", nullable = false)
	private String code;
	@Column(name = "mobnum", nullable = false)
	private String mobnum;

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMobnum() {
		return mobnum;
	}

	public void setMobnum(String mobnum) {
		this.mobnum = mobnum;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Student(int id, String name, String nationality, String code, String mobnum, String location) {
		super();
		this.id = id;
		this.name = name;
		this.nationality = nationality;
		this.code = code;
		this.mobnum = mobnum;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", nationality=" + nationality + ", code=" + code + ", mobnum="
				+ mobnum + ", location=" + location + "]";
	}

	@Column(name = "location", nullable = false)
	private String location;
}

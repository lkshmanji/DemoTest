package com.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Emptab1")
public class Employee {
	public Employee() {
		super();
	}

	public Employee(int eid, String name, String emal) {
		super();
		this.eid = eid;
		this.name = name;
		this.emal = emal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmal() {
		return emal;
	}

	public void setEmal(String emal) {
		this.emal = emal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", emal=" + emal + "]";
	}

	@GeneratedValue
	@Id
	private int eid;
	private String name;

	private String emal;

}

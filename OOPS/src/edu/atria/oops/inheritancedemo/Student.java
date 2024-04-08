package edu.atria.oops.inheritancedemo;

import java.util.*;

public class Student extends Citizen {
	
	
	private int id;
	private String name;
	private String dept;
	public Student(long adhaarNo, String nationality, String address, String dob, char gender,int id,String name,String dept) {
		super(adhaarNo, nationality, address, dob, gender);
		this.id = id;
		this.name = name;
		this.dept = dept;	
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", getAdhaarNo()=" + getAdhaarNo()
				+ ", getNationality()=" + getNationality() + ", getAddress()=" + getAddress() + ", getDob()=" + getDob()
				+ ", getGender()=" + getGender() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}

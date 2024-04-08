package edu.atria.oops.inheritancedemo;

import java.util.*;

public class Citizen {
	private long AdhaarNo;
	private String Nationality;
	private String Address;
	private String Dob;
	private char Gender;
	public Citizen(long adhaarNo, String nationality, String address, String dob, char gender) {
		super();
		this.AdhaarNo = adhaarNo;
		this.Nationality = nationality;
		this.Address = address;
		this.Dob = dob;
		this.Gender = gender;
		
	}
	public long getAdhaarNo() {
		return AdhaarNo;
	}
	public void setAdhaarNo(long adhaarNo) {
		AdhaarNo = adhaarNo;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "Citizen [AdhaarNo=" + AdhaarNo + ", Nationality=" + Nationality + ", Address=" + Address + ", Dob="
				+ Dob + ", Gender=" + Gender + "]";
	}
	

}

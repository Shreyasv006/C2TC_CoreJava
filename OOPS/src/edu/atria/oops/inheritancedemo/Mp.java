package edu.atria.oops.inheritancedemo;

public class Mp extends Citizen{
	private int mpId;
	private String name;
	private String locality;
	private String party;
	public Mp(long adhaarNo, String nationality, String address, String dob, char gender,int mpId,String name,String locality, String party) {
		super(adhaarNo, nationality, address, dob, gender);
		this.mpId=mpId;
		this.name=name;
		this.locality=locality;
		this.party=party;	
		
	}
	public int getMpId() {
		return mpId;
	}
	public void setMpId(int mpId) {
		this.mpId = mpId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	@Override
	public String toString() {
		return "Mp [mpId=" + mpId + ", name=" + name + ", locality=" + locality + ", party=" + party
				+ ", getAdhaarNo()=" + getAdhaarNo() + ", getNationality()=" + getNationality() + ", getAddress()="
				+ getAddress() + ", getDob()=" + getDob() + ", getGender()=" + getGender() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


}

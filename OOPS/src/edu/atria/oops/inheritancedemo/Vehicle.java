package edu.atria.oops.inheritancedemo;

public class Vehicle {
	private String Model;
	private String Company1;
	private String Type;
    public Vehicle(String Model, String Company1, String Type) {
    	super();
    	this.Model=Model;
    	this.Company1=Company1;
    	this.Type=Type;
    	
    }
	public String getModel() {
		return Model;
	}
	public void setModel(String Model) {
		this.Model = Model;
	}
	public String getCompany1() {
		return Company1;
	}
	public void setCompany1(String Company1) {
		Company1 = Company1;
	}
	public String getType() {
		return Type;
	}
	public void setType(String Type) {
		Type = Type;
	}
	@Override
	public String toString() {
		return "Vehicle [Model=" + Model + ", Company1=" + Company1 + ", Type=" + Type + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
    
    
	

}

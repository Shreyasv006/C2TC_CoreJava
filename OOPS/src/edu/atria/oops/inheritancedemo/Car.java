package edu.atria.oops.inheritancedemo;

public class Car extends Vehicle {

	private String Brand;
	private String Company2;
	public Car(String Model, String Company1, String Type, String Brand, String Company2) {
		super(Model, Company1, Type);
		this.Brand = Brand;
		this.Company2 = Company2;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String Brand) {
		Brand = Brand;
	}
	public String getCompany2() {
		return Company2;
	}
	public void setCompany2(String Company2) {
		Company2 = Company2;
	}
	
	
	public String toString() {
		return "Car [Brand=" + Brand + ", Company2=" + Company2   + super.toString() ;
	}
	

}

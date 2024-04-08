package edu.atria.oops.inheritancedemo;

public class SportsCar extends Car {
	private int Topspeed;
	private int CC;
	private String Colour;
	public SportsCar(String Model, String Company1, String Type, String Brand, String Company2, int Topspeed, int CC,
			String Colour) {
		super(Model, Company1, Type, Brand, Company2);
		this.Topspeed = Topspeed;
		this.CC = CC;
		this.Colour = Colour;
	}
	public int getTopspeed() {
		return Topspeed;
	}
	public void setTopspeed(int topspeed) {
		Topspeed = topspeed;
	}
	public int getCC() {
		return CC;
	}
	public void setCC(int CC) {
		CC = CC;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String Colour) {
		Colour = Colour;
	}
	@Override
	public String toString() {
		return "SportsCar [Topspeed=" + Topspeed + ", CC=" + CC + ", Colour=" + Colour   + super.toString();
	}
}

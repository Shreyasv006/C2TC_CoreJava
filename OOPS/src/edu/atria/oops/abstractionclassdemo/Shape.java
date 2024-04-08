package edu.atria.oops.abstractionclassdemo;

public abstract class Shape {
	static float Area;
	//abstract method
	public abstract float calculateArea();
	//non abstract method
	/*public static final void display() {
		System.out.println("Area of the shape: " +Area);
	}*/
	public void display() {
		System.out.println("Area of the shape: " +Area);
		
	}

}

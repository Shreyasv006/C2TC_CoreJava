package edu.atria.oops.abstractionclassdemo;

public class Rectangle extends Shape {
	float Length,Breadth;
	

	public Rectangle(float length, float breadth) {
		super();
		this.Length = length;
		this.Breadth = breadth;
	}


	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return Area=Length*Breadth;
	}

}

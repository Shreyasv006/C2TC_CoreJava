package edu.atria.oops.abstractionclassdemo;

public class Square extends Shape {
	//float Area;
	float Side;

	public Square(float side) {
		super();
		this.Side = side;
	}

	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		return Area=Side*Side;
	}

}

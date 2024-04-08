package edu.atria.oops.abstractionclassdemo;

public class AbstractClassMain {

	public static void main(String[] args) {
		//Dynamic binding
		Shape s=new Square(6);
		Shape r=new Rectangle(10,20);
		s.calculateArea();
		s.display();
		r.calculateArea();
		r.display();
		
		// TODO Auto-generated method stub

	}

}
  
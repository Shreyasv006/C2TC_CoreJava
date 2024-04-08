package edu.atria.oops.inheritancedemo;

public class MultiLevelInheritanceMain {

	public static void main(String[] args) {
		Vehicle v=new Car("X3 Series", "BMW","4 wheeler", "X7 Series", "BMW");
		System.out.println(v);
		Car s=new SportsCar("X3 Series", "BMW","4 wheeler", "X7 Series", "BMW",400, 1000, "Blue");
		System.out.println(s);
		// TODO Auto-generated method stub

	}

}

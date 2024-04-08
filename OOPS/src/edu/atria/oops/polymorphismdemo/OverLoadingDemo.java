package edu.atria.oops.polymorphismdemo;

public class OverLoadingDemo {

	public static void main(String[] args) {
		System.out.println("Addition of two integers: " +MethodOverloading.add(10,20));
		System.out.println("Addition of two float: " +MethodOverloading.add(10.6f,20.5f));
		System.out.println("Addition of int and float : " +MethodOverloading.add(10,20.6f));
		System.out.println("Addition of float and int : " +MethodOverloading.add(10.7f,20));
		System.out.println("Addition of two string : " +MethodOverloading.add("SHRE","YAS"));  

		

	}

}

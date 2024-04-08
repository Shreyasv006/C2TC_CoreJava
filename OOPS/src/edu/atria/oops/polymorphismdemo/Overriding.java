package edu.atria.oops.polymorphismdemo;

public class Overriding {

	public static void main(String[] args) {
		RBI BankOne=new SBI();
		System.out.println(BankOne.getRI());
		RBI BankTwo=new ICICI();
		System.out.println(BankTwo.getRI());
		   
		// TODO Auto-generated method stub

	}

}

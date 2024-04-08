package edu.atria.oops.exceptionhandling;

import java.util.Scanner;

public class AgeTestDemo {
	static void validate(int Age) throws InvalidAgeException {
		if(Age<18) {
			throw new InvalidAgeException("Invalid Age,You are not elegible to vote");
		}
		else {
			System.out.println("Eligible to vote");
			
		}
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub

		int Age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		Age=sc.nextInt();
		try {


			validate(Age);
		}
		catch(InvalidAgeException i){
			System.out.println("Exception caught..."+i.getMessage());
			
			
		}
		sc.close();


	}

}

package edu.atria.oops.exceptionhandling;
//program to demonstrate custom exception
public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super("Invalid Age");
		
	}
	public InvalidAgeException(String message) {
		super(message);
	}
	

}

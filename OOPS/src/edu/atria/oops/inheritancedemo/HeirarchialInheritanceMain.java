package edu.atria.oops.inheritancedemo;

public class HeirarchialInheritanceMain {

	public static void main(String[] args) {
		Citizen m=new Mp(770558007408L,"Indian","Bangalore","2000/12/29",'M',96,"Prajwal","Malleshwaram","BJP");
		//here we r binding dynamically using parent class citizen while creating object.
		System.out.println(m);
		Citizen s=new Student(770558007408L,"Indian","Bangalore","2000/12/29",'M',101,"shreyas","MCA");
		//here we r binding dynamically using parent class citizen while creating object.
		System.out.println(s); 

	}

}

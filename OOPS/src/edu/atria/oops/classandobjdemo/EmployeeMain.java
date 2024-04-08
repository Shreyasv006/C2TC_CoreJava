package edu.atria.oops.classandobjdemo;
import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee details!!!");
		int id=sc.nextInt();
		String name=sc.next();
		float salary=sc.nextFloat();
		String dept=sc.next();
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		e.setDept(dept);
		System.out.println(e.toString());
		Employee eOne=new Employee(id,name,salary,dept);
		System.out.println(eOne.toString());
	}

}

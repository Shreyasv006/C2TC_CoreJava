package edu.atria.oops.classandobjdemo;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private String dept;
	public Employee() {
		System.out.println("Default Constructor is called....");
	}
	public Employee(int id,String name,float salary,String dept) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
		System.out.println("Parameterized Constructor is called....");
	}
	//getters (used to get the data.read only)and setters(used to set the data.write only) method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + this.name + ", salary=" + this.salary + ", dept=" + this.dept + "]";
	}

	
}

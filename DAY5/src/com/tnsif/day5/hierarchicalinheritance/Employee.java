package com.tnsif.day5.hierarchicalinheritance;


public class Employee extends Person
{

	
	// Data members
	private int empId;
	private float salary;
	private String empDept;
	
	// Default Constructor
	public Employee()
	{
		System.out.println("Employee class Default Constructor");
		empId = 101;
		salary = 7.2f;
		empDept = "IT";
	}

	// Para Constructor
	public Employee(int empId, float salary, String empDept, String name, String city) 
	{
		super(name, city);
		this.empId = empId;
		this.salary = salary;
		this.empDept = empDept;
	}

	// Getter-Setter
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	// toString() method
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", empDept=" + empDept + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + "]";
	}
	
	
	
}


package com.tnsif.hierarchicalinheritance;

public class Student extends Person
{

	private String clas;
	private double cgpa;
	
	public Student()
	{
		System.out.println("Student Class Default Constructor");
		clas = "TE";
		cgpa = 6.98d;
	}

	public Student(String name, String city, String clas, double cgpa) {
		super(name, city);
		this.clas = clas;
		this.cgpa = cgpa;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [clas=" + clas + ", cgpa=" + cgpa + ", getName()=" + getName() + ", getCity()=" + getCity()
				+ "]";
	}	
	
	
	
	
	
}

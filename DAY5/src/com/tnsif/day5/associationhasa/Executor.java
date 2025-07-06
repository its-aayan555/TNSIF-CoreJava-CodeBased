package com.tnsif.day5.associationhasa;

public class Executor 
{

	
	public static void main(String[] args) 
	{
		
		Address add = new Address("43/6 Hanuman Nagar", "Pune", "Maharashtra", "411046");
		
		Employee emp = new Employee("Aayan", add);
		
		emp.displayInfo();
		
		System.out.println(emp);

	}

	
}


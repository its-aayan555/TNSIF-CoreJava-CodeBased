package com.tnsif.day5.associationhasa;


public class Executor 
{

	
	public static void main(String[] args) 
	{	
		
		Address address = new Address("46/3 Hanuman Nagar", "Pune", "Maharashtra", "411046");
		
		Person p = new Person("Aayan",address);
		p.displayInfo();
		System.out.println(p);
		
	}

	
}

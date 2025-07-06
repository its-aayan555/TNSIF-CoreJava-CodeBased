package com.tnsif.day5.associationhasa;

public class Employee 
{

	
	private String name;
	private Address address;
	
	// Para constructor
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	// Getter-Setter
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Address getAdddress() 
	{
		return address;
	}
	public void setAdddress(Address address) 
	{
		this.address = address;
	}
	
	
	// Display Data
	public void displayInfo()
	{
		System.out.println("Name : " + name);
		System.out.println("Address : " + address.getStreet() + " " + address.getCity() + 
				           " " + address.getState() + " " + address.getPostalcode());
	}
	
	
	// toString()
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	
	
}


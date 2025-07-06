package com.tnsif.day5.singleinheritance;


public class Citizen 
{

	// Data members
	private String name;
	private String address;
	private String aadharNo;
	private long mobileNo;
	
	// Default Constructor
	public Citizen() 
	{
		System.out.println("Citizen object is Created !");
	}

	// Para Constructor
	public Citizen(String name, String address, String aadharNo, long mobileNo) 
	{
		super();
		this.name = name;
		this.address = address;
		this.aadharNo = aadharNo;
		this.mobileNo = mobileNo;
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

	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getAadharNo() 
	{
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) 
	{
		this.aadharNo = aadharNo;
	}

	public long getMobileNo() 
	{
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) 
	{
		this.mobileNo = mobileNo;
	}

	// toString()
	@Override
	public String toString() 
	{
		return "Citizen [name=" + name + ", address=" + address + ", aadharNo=" + aadharNo + ", mobileNo=" + mobileNo
				+ "]";
	}
	
	
	
}


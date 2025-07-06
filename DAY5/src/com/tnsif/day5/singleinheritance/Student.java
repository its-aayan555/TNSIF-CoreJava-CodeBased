package com.tnsif.day5.singleinheritance;


public class Student extends Citizen
{
	
	// No need 
	// private String studName;
	// private String studAddress;
	// private long studMobileNo;
	
	// Data members
	private int studRollNo;
	private String studCollege;
	
	// Default Constructor
	public Student()
	{
		super();
	}

	// Para Constructor
	public Student(String name, String address, String aadharNo, long mobileNo, int studRollNo, String studCollege) 
	{
		super( name, address, aadharNo, mobileNo);
		this.studRollNo = studRollNo;
		this.studCollege = studCollege;
	}

	// Getter-Setter
	public int getStudRollNo() 
	{
		return studRollNo;
	}
	public void setStudRollNo(int studRollNo) 
	{
		this.studRollNo = studRollNo;
	}

	public String getStudCollege() 
	{
		return studCollege;
	}
	public void setStudCollege(String studCollege) 
	{
		this.studCollege = studCollege;
	}
	
	// toString()
	@Override
	public String toString() {
		return "Student [studRollNo=" + studRollNo + ", studCollege=" + studCollege + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getAadharNo()=" + getAadharNo() + ", getMobileNo()="
				+ getMobileNo() + "]";
	}
	
	
}


package com.tnsif.finalkeyword;


final class FinalClass
{
	
	void show()
	{
		System.out.println("Final class method");
	}
	
}

// Cannot Inherit the Class declared as Final Class
// class Student extends FinalClass
// {
//	
// }


public class FinalClassDemo 
{

	
	public static void main(String[] args) 
	{
	
		FinalClass fc = new FinalClass();
		fc.show();
		
	}
	
	
}

package com.tnsif.day5.hierarchicalinheritance;


public class HierarchicalInheritanceDemo 
{

	
	public static void main(String[] args) 
	{
		
		// Object creation and Default values printing
		System.out.println("\nDefault Values - \n");	
		Person p;
		p = new Person();
		System.out.println(p);
		System.out.println("**********************************************");
		
		p = new Student();
		System.out.println(p);
		System.out.println("**********************************************");
		
		p = new Employee();
		System.out.println(p);
		System.out.println("**********************************************");
		
		// New Paramaterized Values Printing
		System.out.println("\n\nParameters Values - \n");	
		Person p5;
		p5 = new Person("Prem", "Pune");
		System.out.println(p5);
		System.out.println("**********************************************");
		
		p5 = new Student("Prem", "Pune", "TE", 6.69);
		System.out.println(p5);
		System.out.println("**********************************************");
		
		p5 = new Employee(1001, 3.6f, "Mech", "Prem", "Pune");
		System.out.println(p5);
		System.out.println("**********************************************");		
		

	}

	
}


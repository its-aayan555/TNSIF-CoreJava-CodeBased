package com.tnsif.day5.multilevelinheritance;


public class State extends Country
{

	// Data members
	private String stateName;
	private String langguage;
	
	// Getter-Setter
	public String getStateName() 
	{
		return stateName;
	}
	public void setStateName(String stateName) 
	{
		this.stateName = stateName;
	}
	
	public String getLangguage() 
	{
		return langguage;
	}
	public void setLangguage(String langguage) 
	{
		this.langguage = langguage;
	}
	
	// toString()
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", langguage=" + langguage + ", getCountryName()=" + getCountryName()
				+ ", getCapital()=" + getCapital() + "]";
	}
	
		
}


package com.tnsif.day5.multilevelinheritance;


public class Country 
{
	// Data members
	private String countryName;
	private String capital;
	
	// Getter-Setter
	public String getCountryName() 
	{
		return countryName;
	}
	public void setCountryName(String countryName) 
	{
		this.countryName = countryName;
	}
	
	public String getCapital() 
	{
		return capital;
	}
	public void setCapital(String capital) 
	{
		this.capital = capital;
	}
	
	// toString()
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", capital=" + capital + "]";
	}
	
	
}


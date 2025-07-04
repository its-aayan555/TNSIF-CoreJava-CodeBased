package com.tnsif.multilevelinheritance;

public class City extends State
{

	// Data members
	private String cityName;
	private float cityArea;
	
	// Getter-Setter
	public String getCityName() 
	{
		return cityName;
	}
	public void setCityName(String cityName) 
	{
		this.cityName = cityName;
	}
	
	public float getCityArea()
	{
		return cityArea;
	}
	public void setCityArea(float cityArea) 
	{
		this.cityArea = cityArea;
	}
	
	// toString()
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", cityArea=" + cityArea + ", getStateName()=" + getStateName()
				+ ", getLangguage()=" + getLangguage() + ", getCountryName()=" + getCountryName() + ", getCapital()="
				+ getCapital() + "]";
	}
	
	
	
}

package com.tnsif.day5.multilevelinheritance;

//	Extends state multilevel inheritance
public class City extends State 
{
	
	//	Data member
	private String cityName;
	private float area;

	//	Getter Setter method
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}

	//	toString Method
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", getStateName()=" + getStateName()
				+ ", getLanguage()=" + getLanguage() + ", getCountryName()=" + getCountryName() + ", getCapital()=" + getCapital() + "]";
	}


}
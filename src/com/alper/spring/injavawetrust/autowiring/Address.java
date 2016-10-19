package com.alper.spring.injavawetrust.autowiring;

/**
 * @author Alper
 * 
 */
public class Address {

	private String city;
	private String district;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String distcrit) {
		this.district = distcrit;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", distcrit=" + district + "]";
	}

}

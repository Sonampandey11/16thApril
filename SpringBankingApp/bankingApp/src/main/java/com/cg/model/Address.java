package com.cg.model;

public class Address {
	private String street;
	private String houseNumber;
	private String pinNumber;
	private String city;
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the houseNumber
	 */
	public String getHouseNumber() {
		return houseNumber;
	}
	/**
	 * @param houseNumber the houseNumber to set
	 */
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	/**
	 * @return the pinNumber
	 */
	public String getPinNumber() {
		return pinNumber;
	}
	/**
	 * @param pinNumber the pinNumber to set
	 */
	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String street, String houseNumber, String pinNumber, String city) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
		this.pinNumber = pinNumber;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [street=" + street + ", houseNumber=" + houseNumber + ", pinNumber=" + pinNumber + ", city="
				+ city + "]";
	}
	
	
	
	
	
	

}

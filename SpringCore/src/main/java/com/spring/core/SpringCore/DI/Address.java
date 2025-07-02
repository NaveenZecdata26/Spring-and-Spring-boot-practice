package com.spring.core.SpringCore.DI;

public class Address {

	private String city;
	private String houseNumber;
	private String rowNumber;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getRowNumber() {
		return rowNumber;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", houseNumber=" + houseNumber + ", rowNumber=" + rowNumber + "]";
	}

	public void setRowNumber(String rowNumber) {
		this.rowNumber = rowNumber;
	}

}

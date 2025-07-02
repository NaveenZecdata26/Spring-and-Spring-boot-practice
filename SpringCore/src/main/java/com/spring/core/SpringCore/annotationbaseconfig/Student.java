package com.spring.core.SpringCore.annotationbaseconfig;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	private String email;
	private String number;
	private Address address;
			
	public Student(String name, String email, String number, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", number=" + number + ", address=" + address + "]";
	}
	

}

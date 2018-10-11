package com.cg.project.iodemo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Associate implements Serializable{
	private String firstName,lastName;
	private int empNo;
	private Address address;
	public Associate(String firstName, String lastName, int empNo,
			Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empNo = empNo;
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Associate [firstName=" + firstName + ", lastName=" + lastName
				+ ", empNo=" + empNo + ", address=" + address + " ";
	}
	
	
}

package com.capgemini.lab2;

public class Person2_3 {
	//2.3: Refer the class diagram given and create a person class.
	private String firstName;
	private String lastName;
	private char gender;
	public Person2_3() {
		
	}
	public Person2_3(String firstName, String lastName, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

}

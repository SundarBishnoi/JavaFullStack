package com.capgemini.lab2;
//2.5: Modify the above program, to accept only ‘M’ or ‘F’ as gender field values. Use Enumeration for implementing the same.
enum Gender
{
	M, F
}

public class Modified2Person2_5 {
	
	
	private String firstName;
	private String lastName;
	Gender gender;
	private long phonenumber;
	
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Modified2Person2_5() {
		
	}
	public Modified2Person2_5(String firstName, String lastName, Gender gender,long phonenumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phonenumber= phonenumber;
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(String gender) {
		Gender gen=Gender.valueOf(gender.toUpperCase());
		this.gender=gen;
	}

}




package com.capgemini.lab2;
//2.4: Modify Lab assignment 2.3 to accept phone number of a person. Create a newmethod to implement the same and also define method for displaying persondetails.
public class ModifiedPersonMain2_4 {
	public static void main(String[] args) {
		ModifiedPerson2_4 p=new ModifiedPerson2_4("Abhilasha","Sawnerkar",'F',9579605747L);
		System.out.println("Person Details");
		System.out.println("----------------");
		System.out.println("First Name: "+p.getFirstName());
		System.out.println("Last Name: "+p.getLastName());
		System.out.println("Gender: "+p.getGender());
		System.out.println("Phonenumber: "+p.getPhonenumber());
	}

}

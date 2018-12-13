package com.capgemini.lab2;

public class PersonMain2_3 {
	/*Create “PersonMain.java” program and write code for following operations:
		a) Create an object of Person class and specify person details through constructor.
		b) Display the details in the format given in Lab assignment 2.1*/
	public static void main(String[] args) {
		Person2_3 p=new Person2_3("Abhilasha","Sawnerkar",'F');
		System.out.println("Person Details");
		System.out.println("----------------");
		System.out.println("First Name: "+p.getFirstName());
		System.out.println("Last Name: "+p.getLastName());
		System.out.println("Gender: "+p.getGender());
		
	}

}

package com.cg.project.iodemo;
// Java program to read data of various types using Scanner class. 
import java.util.Scanner; 
public class ScanningMain 
{ 
	public static void main(String[] args) 
	{ 
		// Declare the object and initialize with 
		// predefined standard input object 
		Scanner sc = new Scanner(System.in); 

		// String input 
		System.out.println("input string");
		String name = sc.nextLine(); 

		// Character input 
		System.out.println("input char");
		char gender = sc.next().charAt(0); 

		// Numerical data input 
		// byte, short and float can be read 
		// using similar-named functions. 
		System.out.println("input int");
		int age = sc.nextInt(); 
		System.out.println("input long");
		long mobileNo = sc.nextLong();
		System.out.println("input double");
		double cgpa = sc.nextDouble(); 

		// Print the values to check if input was correctly obtained. 
		System.out.println("Name: "+name); 
		System.out.println("Gender: "+gender); 
		System.out.println("Age: "+age); 
		System.out.println("Mobile Number: "+mobileNo); 
		System.out.println("CGPA: "+cgpa); 
		sc.close();
	} 
} 

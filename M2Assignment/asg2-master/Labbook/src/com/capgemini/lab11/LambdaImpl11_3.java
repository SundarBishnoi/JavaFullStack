package com.capgemini.lab11;

import java.util.Scanner;

public class LambdaImpl11_3 {

	public static void main(String[] args) {
		
		LambdaInterface11_3 lm= (username,password)->{
			if(username.equalsIgnoreCase("ADMIN")&& password.equalsIgnoreCase("ADMIN@123"))
				return true;
			else
				return false;
			};
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter user name and password: ");
			System.out.println(lm.validation(sc.next(), sc.next()));
		}

}

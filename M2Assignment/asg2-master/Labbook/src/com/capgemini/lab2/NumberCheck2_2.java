package com.capgemini.lab2;

public class NumberCheck2_2 {
	//2.2: Write a program to accept a number from user as a command line argument and check whether the given number is positive or negative number.
	public void check(String n)
	{
		
		char s='-';
		char s2=n.charAt(0);
		if(s==s2)
			System.out.println("negative");
		else
			System.out.println("positive");
	}
	public static void main(String[] args) {
		NumberCheck2_2 a=new NumberCheck2_2();
		//for numbers in command line arguments
		for(int i=0;i<args.length;i++)
		{System.out.println();
		System.out.println(args[i]);
		a.check(args[i]);
		}
		
		
		
		
		
		
	}
	
	

}

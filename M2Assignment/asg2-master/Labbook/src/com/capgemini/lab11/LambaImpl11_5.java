package com.capgemini.lab11;

import java.util.Scanner;

public class LambaImpl11_5 implements LambdaInterface11_5{

	int n;
	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		LambdaInterface11_5 lm=LambaImpl11_5::new;
		lm.fact(num);
	
	}

	public LambaImpl11_5(int n) {
		super();
		this.n = n;
		fact(n);
	}

	@Override
	public void fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial= "+fact);
	}

}

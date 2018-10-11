package com.project.client;

import com.project.lambdainterface.FuncationalInterface1;
import com.project.lambdainterface.FunctionalInterface2;

public class MainClass {

	public static void main(String[] args) {
		/*FuncationalInterface1 fun= new FuncationalInterface1() {
			
			@Override
			public void greetUser() {
				System.out.println("Hello User");
				
			}
		};
		fun.greetUser();*/
		FuncationalInterface1 ref1 = (firstName,lastName)->System.out.println("Hello "+firstName+" "+lastName);
		ref1.greetUser("Manali","Kedar");
		FunctionalInterface2 ref2 =(a,b)->a+b;
		System.out.println(ref2.add(100, 200));
		

	}

}

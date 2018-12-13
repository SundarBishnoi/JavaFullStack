package com.capgemini.lab10;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest10_2_1 {

	@Test
	public void test1() {
		Person10_2_1 p=new Person10_2_1("Abhilasha","Sawnerkar",'F');
		String fname=p.getFirstName();
		assertEquals("Abhilasha", fname);
	}
	@Test
	public void test2() {
		Person10_2_1 p=new Person10_2_1("Abhilasha","Sawnerkar",'F');
		String lname=p.getLastName();
		assertEquals("Sawnerkar", lname);
	}
	@Test
	public void test3() {
		Person10_2_1 p=new Person10_2_1("Abhilasha","Sawnerkar",'F');
		char gender=p.getGender();
		assertEquals('F', gender);
	}

}

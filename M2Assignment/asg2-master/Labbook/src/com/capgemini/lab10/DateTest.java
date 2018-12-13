package com.capgemini.lab10;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {

	@Test
	public void test1() {
		Date dt=new Date();
		int day=dt.getDay();
		assertEquals(day, 28);
		
	}
	@Test
	public void test2() {
		Date dt=new Date();
		int month=dt.getMonth();
		assertEquals(month, 9);
		
	}
	@Test
	public void test3() {
		Date dt=new Date();
		int year=dt.getYear();
		assertEquals(year, 1996);
		
	}

}

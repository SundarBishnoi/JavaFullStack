package com.capgemini.lab10;

import static org.junit.Assert.*;

import org.junit.Test;


import com.cg.eis.exception.EmployeeException;

public class EmployeeExceptionTest {

	@Test(expected=EmployeeException.class)
	public void test() throws EmployeeException {
		Employee10_2_2 emp= new Employee10_2_2();
		emp.setId(100);
		emp.setDesignation("Analyst");
		emp.setInsuranceScheme("Scheme A");
		emp.setLname("Patil");
		emp.setName("Purva");
		emp.setSalary(2000);
		
	}

}

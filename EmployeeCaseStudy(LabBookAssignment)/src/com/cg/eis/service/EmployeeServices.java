package com.cg.eis.service;
public interface EmployeeServices {
	void acceptDetails(int employeeId,String name,long salary);
	String findInsuranceScheme(long salary );
	void displayDetails();
}
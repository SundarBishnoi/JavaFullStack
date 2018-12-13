package com.capgemini.lab10;

import com.cg.eis.exception.EmployeeException;

public class Employee10_2_2 {
	private int id;
	private String name;
	private String lname;
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	private double salary;
	private String designation;
	private String insuranceScheme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name)  {
		
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) throws EmployeeException {
		if(salary<=3000)
		{
			throw new EmployeeException();
		}
		else
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	

}

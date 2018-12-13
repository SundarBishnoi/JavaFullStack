package com.cg.eis.beans;
public class Employee {
	private int employeeId;
	private long salary;
	private String name,designation,insuranceScheme;
	public Employee() {
		super();
	}
	public Employee(int employeeId, long salary, String name,
			String designation) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.name = name;
		this.designation = designation;
	}
	public Employee(int employeeId, long salary, String name) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.name = name;
	}	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "Employee [employeeId=" + this.getEmployeeId() + ", salary=" +this.getSalary()
				+ ", name=" + this.getName() + ", designation=" + this.getDesignation()
				+ ", insuranceScheme=" + this.getInsuranceScheme() + "]";
	}
}
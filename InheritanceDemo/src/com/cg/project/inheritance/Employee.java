package com.cg.project.inheritance;

public abstract class Employee {
	private int employeeId,totalSalary,basicSalary;
	private String firstname,lastname;

	public Employee(int employeeId, String firstname, String lastname) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}

	public Employee(int employeeId, int basicSalary, String firstname,
			String lastname) {
		super();
		this.employeeId = employeeId;
		this.basicSalary = basicSalary;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public abstract void calculateTotalSalary() ;

	@Override
	public String toString() {
		return "employeeId=" + employeeId + ", totalSalary="
				+ totalSalary + ", basicSalary=" + basicSalary + ", firstname="
				+ firstname + ", lastname=" + lastname +" ";
	}
	
}

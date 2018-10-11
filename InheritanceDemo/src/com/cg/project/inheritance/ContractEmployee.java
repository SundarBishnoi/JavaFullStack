package com.cg.project.inheritance;

public class ContractEmployee extends Employee{
	public ContractEmployee(int employeeId, String firstname, String lastname,int noOfHrs,int variablePay) {
		super(employeeId, firstname, lastname);
		this.noOfHrs=noOfHrs;
		this.variablePay=variablePay;
	}

	private int noOfHrs,variablePay;


	public int getNoOfHrs() {
		return noOfHrs;
	}

	public void setNoOfHrs(int noOfHrs) {
		this.noOfHrs = noOfHrs;
	}

	public int getVariablePay() {
		return variablePay;
	}

	public void setVariablePay(int variablePay) {
		this.variablePay = variablePay;
	}

	@Override
	public void calculateTotalSalary() {
			
			this.setTotalSalary((getNoOfHrs()*300)+getVariablePay());
	}

	@Override
	public String toString() {
		return " noOfHrs=" + noOfHrs + ", variablePay="
				+ variablePay + " Total Salary "+this.getTotalSalary();
	}
	
	

}

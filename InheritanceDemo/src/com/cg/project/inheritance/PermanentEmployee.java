package com.cg.project.inheritance;

public class PermanentEmployee extends Employee{

	public PermanentEmployee(int employeeId, int basicSalary, String firstname,
			String lastname) {
		super(employeeId, basicSalary, firstname, lastname);
		// TODO Auto-generated constructor stub
	}
	public PermanentEmployee(int employeeId, int basicSalary, String firstname,
			String lastname,int hra, int ta, int da) {
		super(employeeId, basicSalary, firstname, lastname);
		this.hra = hra;
		this.ta = ta;
		this.da = da;
	}
	private int hra,ta,da;
	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getTa() {
		return ta;
	}
	public void setTa(int ta) {
		this.ta = ta;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	@Override
	public void calculateTotalSalary() {
		hra = (this.getBasicSalary()*30)/100;
		da = (this.getBasicSalary()*30)/100;
		ta = (this.getBasicSalary()*30)/100;
		this.setTotalSalary(this.getBasicSalary()+hra+ta+da);
	}
	@Override
	public String toString() {
		return super.toString()+"hra=" + hra + ", ta=" + ta + ", da=" + da;
	}

	

}

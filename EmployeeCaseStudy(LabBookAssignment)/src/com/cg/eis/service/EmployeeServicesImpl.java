package com.cg.eis.service;
import com.cg.eis.beans.Employee;
public class EmployeeServicesImpl implements EmployeeServices{
	static Employee employee=new Employee();
	@Override
	public String findInsuranceScheme(long salary) {
		if(employee.getSalary()>5000 && employee.getSalary()<20000){
			employee.setDesignation("System Associate");
			employee.setInsuranceScheme("Scheme C");
		}
		else if(employee.getSalary()>=20000 && employee.getSalary()<40000){
			employee.setDesignation("Programmer");
			employee.setInsuranceScheme("Scheme B");
		}
		else if(employee.getSalary()>=40000){
			employee.setDesignation("Manager");
			employee.setInsuranceScheme("Scheme A");
		}
		else if(employee.getSalary()<5000){
			employee.setDesignation("Clerk");
			employee.setInsuranceScheme("No Scheme");
		}
		return employee.getInsuranceScheme();
	}
	@Override
	public void displayDetails() {
		System.out.println(employee.toString());
	}
	@Override
	public void acceptDetails(int employeeId, String name, long salary) {
		employee=new Employee(employeeId, salary, name);
		
	}
}
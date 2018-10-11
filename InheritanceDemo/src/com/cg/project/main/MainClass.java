package com.cg.project.main;

import com.cg.project.inheritance.ContractEmployee;
import com.cg.project.inheritance.Employee;
import com.cg.project.inheritance.PermanentEmployee;
public class MainClass {
	public static void main(String[] args) {
		PermanentEmployee permanentEmployee = new PermanentEmployee(101, 25000, "Manali", "Kedar");
		
		permanentEmployee.calculateTotalSalary();
		
		System.out.println(permanentEmployee.toString());
		ContractEmployee cemp = new ContractEmployee(103, "Tanu", "Verma", 500, 5000);
		cemp.calculateTotalSalary();
		System.out.println(cemp.toString());
		Employee emp = new PermanentEmployee(104, 25000, "Kumar", "Sanu");
		emp.calculateTotalSalary();
		System.out.println(emp.getTotalSalary());	
	}
}

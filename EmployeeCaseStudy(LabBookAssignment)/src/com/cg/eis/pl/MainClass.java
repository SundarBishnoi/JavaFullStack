package com.cg.eis.pl;
import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.EmployeeServices;
import com.cg.eis.service.EmployeeServicesImpl;
public class MainClass {
	static Scanner k=new Scanner(System.in);
	public static void main(String[] args) throws EmployeeException{
		int id;
		String name;
		long salary;
		EmployeeServices employeeServices=new EmployeeServicesImpl();
		System.out.println("Enter the name");
		name=k.nextLine();
		System.out.println("Enter id ");
		id=k.nextInt();
		System.out.println("Enter Salary");
		salary=k.nextLong();
		if(salary<3000)
			throw new EmployeeException();
		else{
		employeeServices.acceptDetails(id, name, salary);
		employeeServices.findInsuranceScheme(salary);
		employeeServices.displayDetails();
		}
	}
}
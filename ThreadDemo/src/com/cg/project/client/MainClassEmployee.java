package com.cg.project.client;

import java.util.ArrayList;
import java.util.stream.Stream;

import com.cg.project.bean.Employee;

public class MainClassEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, 25000, "Manali", "Kedar"));
		empList.add(new Employee(101, 25000, "Prerna", "Kedar"));
		empList.add(new Employee(102, 25000, "Jayesh", "Kedar"));
		empList.add(new Employee(104, 25000, "Madhuri", "Kedar"));
		empList.add(new Employee(103, 25000, "Pralhad", "Kedar"));
		empList.add(new Employee(103, 25000, "Pralhad", "Kedar"));
		
		Stream<Employee> stream1=empList.stream();
		Stream<Employee> stream2=stream1.distinct();
		Stream<Employee> stream3=stream2.filter((employee)->employee.getFirstname().startsWith("M"));
		System.out.println("Line 21 "+stream3.count());
		//stream3.forEach(employee->System.out.println(employee));

		empList.stream()
		.distinct()
		.filter(e->e.getFirstname().startsWith("M"))
		.forEach(employee->System.out.println(employee));
		
		long count=empList.stream()
				.distinct()
				.count();
		System.out.println("Line 31 "+count+" "+empList.size());
		System.out.println(empList.stream().map(employee->employee.getBasicSalary()));

	}

}

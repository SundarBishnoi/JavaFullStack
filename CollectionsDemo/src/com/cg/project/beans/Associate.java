package com.cg.project.beans;

public class Associate implements Comparable<Associate>{
	private int associateId,salary;
	private String firstName;
	public int getAssociatId() {
		return associateId;
	}
	public void setAssociatId(int associatId) {
		this.associateId = associatId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Associate(int associatId, int salary, String firstName) {
		super();
		this.associateId = associatId;
		this.salary = salary;
		this.firstName = firstName;
	}
	public String toString() {
		return "AssociateId=" + associateId + ", Salary=" + salary
				+ ", FirstName=" + firstName;
	}
	@Override
	public int compareTo(Associate o) {
//		return this.firstName.compareTo(o.getFirstName());
		return this.associateId-o.associateId;
//		return this.salary-o.salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + associateId;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Associate other = (Associate) obj;
		if (associateId != other.associateId)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	
}

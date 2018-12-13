package com.capgemini.lab11;

public class Lab11_4main implements Lab11_4Interface{

	int age;
	String name;
	int id;

	
	public Lab11_4main(int age, String name, int id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
		Person p=new Person(age,name,id);
		System.out.println(p);
		
	}

	@Override
	public Lab11_4main getlab11_4main(int id, String name, int age) {
		return null;
	}

	public static void main(String[] args) {
	
		Lab11_4Interface lm= Lab11_4main::new;
		lm.getlab11_4main(120,"Purva", 22);
	}

}

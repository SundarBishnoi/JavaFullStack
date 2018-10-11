package com.cg.project.iodemo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Address implements Serializable{
	private String city,state;

	@Override
	public String toString() {
		return "city=" + city + ", state=" + state ;
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}

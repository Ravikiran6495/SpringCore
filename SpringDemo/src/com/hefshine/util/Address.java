package com.hefshine.util;

public class Address {
	
	
	private String city;
	private String state;
	
	
	public Address() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Deafult const");
	}


	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
		System.out.println("para const");
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


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
	public void dis()
	{
		System.out.println(state  + "       " +city);
		
	}
	
	

}

package com.hefshine.util;

public class Student {
	
	int roll_number;
	String name;
	Address addres;
	
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Student(int roll_number, String name, Address addres) {
		super();
		this.roll_number = roll_number;
		this.name = name;
		this.addres = addres;
	}



	public int getRoll_number() {
		return roll_number;
	}





	public void setRoll_number(int roll_number) {
		System.out.println("roll_number setter is called");
		this.roll_number = roll_number;
	}


	public String getName() {
		
		return name;
	}





	public void setName(String name) {
		
		System.out.println("name setter is called");
		this.name = name;
	}





	public Address getAddres() {
		return addres;
	}





	public void setAddres(Address addres) {
		this.addres = addres;
	}





	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", name=" + name + ", addres=" + addres + "]";
	}





	public void Study()
	{
		System.out.println("Study");
	}
	
	
	
	public void display()
	{
		System.out.println(roll_number  +   name);
		System.out.println(addres);
	}
	
	

	
	
}

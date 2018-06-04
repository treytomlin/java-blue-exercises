package com.techelevator.person;

public class Person {

	private String firstName = "";
	private String lastName = "";
	private int age;
	

	
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFullName() {
		//returns the lastName + ", " + firstName
	return this.firstName + this.lastName;
	}

	public boolean isAdult() {
		//returns true if the person is 18 or older
		if(this.age >= 18) {
			return true;
		}
		return false;
	}
	
}

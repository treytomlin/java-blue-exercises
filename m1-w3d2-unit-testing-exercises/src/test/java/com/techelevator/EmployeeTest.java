package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class EmployeeTest {
	
	private Employee employee;
	
	@Before
	public void setup() {
		employee = new Employee(123, "Trey", "Tomlin", 50000.0);
	}
	

	@Test
	public void salary_raise_accuracy() {
		employee.RaiseSalary(10.0);
		Assert.assertEquals(55000.0, employee.getAnnualSalary());
		
	} 
	@Test
	public void salary_raise_negative_percentage_accuracy() {
		employee.RaiseSalary(-10.0);
		Assert.assertEquals(50000.0, employee.getAnnualSalary());
		
	} 
	@Test
	public void salary_raise_0percent_accuracy() {
		employee.RaiseSalary(0.0);
		Assert.assertEquals(50000.0, employee.getAnnualSalary());
		
	}  
	
	

}

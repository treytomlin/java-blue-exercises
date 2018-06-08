package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {
	
	HomeworkAssignment homeworkAssignment;
	
	@Before
	public void setup() {
		homeworkAssignment = new HomeworkAssignment(100);
	}
	@Test
	public void get_a_on_assignment() {
		//Arrange
		homeworkAssignment.setTotalMarks(95);
		Assert.assertEquals("A", homeworkAssignment.getLetterGrade());
	}
	@Test
	public void get_b_on_assignment() {
		//Arrange
		homeworkAssignment.setTotalMarks(85);
		Assert.assertEquals("B", homeworkAssignment.getLetterGrade());
	}
	@Test
	public void get_c_on_assignment() {
		//Arrange
		homeworkAssignment.setTotalMarks(75);
		Assert.assertEquals("C", homeworkAssignment.getLetterGrade());
	}
	@Test
	public void get_d_on_assignment() {
		//Arrange
		homeworkAssignment.setTotalMarks(65);
		Assert.assertEquals("D", homeworkAssignment.getLetterGrade());
	}
	@Test
	public void get_f_on_assignment() {
		//Arrange
		homeworkAssignment.setTotalMarks(55);
		Assert.assertEquals("F", homeworkAssignment.getLetterGrade());
	}
	
		
		
		
			
		  
	

}
 
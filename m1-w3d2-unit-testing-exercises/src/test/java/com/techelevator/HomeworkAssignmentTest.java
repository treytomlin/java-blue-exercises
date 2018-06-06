package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {
	
	private HomeworkAssignment homeworkAssignment;
	
	@Before
	public void setup() {
		homeworkAssignment = new HomeworkAssignment(100);
	}
	@Test
	public void get_a_on_assignment() {
		
		Assert.assertEquals("A", homeworkAssignment.getLetterGrade());
	}
		
	

}

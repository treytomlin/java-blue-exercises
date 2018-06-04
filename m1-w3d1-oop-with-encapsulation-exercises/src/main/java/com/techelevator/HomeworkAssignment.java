package com.techelevator;

public class HomeworkAssignment {
		private int totalMarks;
		private int possibleMarks;
		private String submitterName;
		private String letterGrade;  // derived
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}

	public String getLetterGrade() {
		int grade = this.totalMarks / this.possibleMarks; // 
		double grade2 = grade * 1.00d;
		if(grade2 >= .90) {
			letterGrade = "A";
		}
		if(grade2 >= .80 && grade <= .89) {
			letterGrade = "B";
		}
		if(grade2 >= .70 && grade <= .79) {
			letterGrade = "C";
		}
		if(grade2 >= .60 && grade <= .69) {
			letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}
		
		return letterGrade;
	}
	
	
	
	
	

}

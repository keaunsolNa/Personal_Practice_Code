package com.example.demo;

public class Moim {

	int maxNumberofAttendess;
	
	int numberOfEnrollment;
	
	public boolean isEnrollmentFull() {
		if(maxNumberofAttendess == 0) {
			return false;
		}
		
		if(numberOfEnrollment < maxNumberofAttendess) {
			return false;
		}
		
		return true;
	}
}

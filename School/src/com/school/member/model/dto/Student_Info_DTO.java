package com.school.member.model.dto;

import java.io.Serializable;
import java.util.Date;

public class Student_Info_DTO implements Serializable{

	private static final long serialVersionUID = 3649256603839327661L;
	private int StudentNo;
	private int StudentClassNo;
	private int StudentDivisionNo;
	private int StudentCANo;
	private String StudentName;
	private String StudentSSN;
	private String StudentPhone;
	private String StudentAddress;
	private String StudentGraduationYN;
	private java.util.Date studentDayOfEntrance;
	
	public Student_Info_DTO() {
	}
	public Student_Info_DTO(int studentNo, int studentClassNo, int studentDivisionNo, int studentCANo,
			String studentName, String studentSSN, String studentPhone, String studentAddress,
			String studentGraduationYN, Date studentDayOfEntrance) {
		StudentNo = studentNo;
		StudentClassNo = studentClassNo;
		StudentDivisionNo = studentDivisionNo;
		StudentCANo = studentCANo;
		StudentName = studentName;
		StudentSSN = studentSSN;
		StudentPhone = studentPhone;
		StudentAddress = studentAddress;
		StudentGraduationYN = studentGraduationYN;
		this.studentDayOfEntrance = studentDayOfEntrance;
	}
	public int getStudentNo() {
		return StudentNo;
	}
	public void setStudentNo(int studentNo) {
		StudentNo = studentNo;
	}
	public int getStudentClassNo() {
		return StudentClassNo;
	}
	public void setStudentClassNo(int studentClassNo) {
		StudentClassNo = studentClassNo;
	}
	public int getStudentDivisionNo() {
		return StudentDivisionNo;
	}
	public void setStudentDivisionNo(int studentDivisionNo) {
		StudentDivisionNo = studentDivisionNo;
	}
	public int getStudentCANo() {
		return StudentCANo;
	}
	public void setStudentCANo(int studentCANo) {
		StudentCANo = studentCANo;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentSSN() {
		return StudentSSN;
	}
	public void setStudentSSN(String studentSSN) {
		StudentSSN = studentSSN;
	}
	public String getStudentPhone() {
		return StudentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		StudentPhone = studentPhone;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	public String getStudentGraduationYN() {
		return StudentGraduationYN;
	}
	public void setStudentGraduationYN(String studentGraduationYN) {
		StudentGraduationYN = studentGraduationYN;
	}
	public java.util.Date getStudentDayOfEntrance() {
		return studentDayOfEntrance;
	}
	public void setStudentDayOfEntrance(java.util.Date studentDayOfEntrance) {
		this.studentDayOfEntrance = studentDayOfEntrance;
	}
	@Override
	public String toString() {
		return "Student_Info_DTO [StudentNo=" + StudentNo + ", StudentClassNo=" + StudentClassNo
				+ ", StudentDivisionNo=" + StudentDivisionNo + ", StudentCANo=" + StudentCANo + ", StudentName="
				+ StudentName + ", StudentSSN=" + StudentSSN + ", StudentPhone=" + StudentPhone + ", StudentAddress="
				+ StudentAddress + ", StudentGraduationYN=" + StudentGraduationYN + ", studentDayOfEntrance="
				+ studentDayOfEntrance + "]";
	}
	
	
}

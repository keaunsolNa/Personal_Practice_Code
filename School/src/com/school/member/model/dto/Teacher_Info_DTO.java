package com.school.member.model.dto;

import java.io.Serializable;

public class Teacher_Info_DTO implements Serializable {

	private static final long serialVersionUID = -7110297172544833893L;
	private int teacherNo;
	private String teacherName;
	private String teacherPhone;
	private int teacherYearly;
	private String teacherDropYN;
	private int teacherSalary;
	private int teacherDivisionNo;
	private int teacherFartDivisionNo;
	
	public Teacher_Info_DTO() {
	}
	public Teacher_Info_DTO(int teacherNo, String teacherName, String teacherPhone, int teacherYearly,
			String teacherDropYN, int teacherSalary, int teacherDivisionNo, int teacherFartDivisionNo) {
		this.teacherNo = teacherNo;
		this.teacherName = teacherName;
		this.teacherPhone = teacherPhone;
		this.teacherYearly = teacherYearly;
		this.teacherDropYN = teacherDropYN;
		this.teacherSalary = teacherSalary;
		this.teacherDivisionNo = teacherDivisionNo;
		this.teacherFartDivisionNo = teacherFartDivisionNo;
	}
	public int getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(int teacherNo) {
		this.teacherNo = teacherNo;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherPhone() {
		return teacherPhone;
	}
	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}
	public int getTeacherYearly() {
		return teacherYearly;
	}
	public void setTeacherYearly(int teacherYearly) {
		this.teacherYearly = teacherYearly;
	}
	public String getTeacherDropYN() {
		return teacherDropYN;
	}
	public void setTeacherDropYN(String teacherDropYN) {
		this.teacherDropYN = teacherDropYN;
	}
	public int getTeacherSalary() {
		return teacherSalary;
	}
	public void setTeacherSalary(int teacherSalary) {
		this.teacherSalary = teacherSalary;
	}
	public int getTeacherDivisionNo() {
		return teacherDivisionNo;
	}
	public void setTeacherDivisionNo(int teacherDivisionNo) {
		this.teacherDivisionNo = teacherDivisionNo;
	}
	public int getTeacherFartDivisionNo() {
		return teacherFartDivisionNo;
	}
	public void setTeacherFartDivisionNo(int teacherFartDivisionNo) {
		this.teacherFartDivisionNo = teacherFartDivisionNo;
	}
	@Override
	public String toString() {
		return "Teacher_Info_DTO [teacherNo=" + teacherNo + ", teacherName=" + teacherName + ", teacherPhone="
				+ teacherPhone + ", teacherYearly=" + teacherYearly + ", teacherDropYN=" + teacherDropYN
				+ ", teacherSalary=" + teacherSalary + ", teacherDivisionNo=" + teacherDivisionNo
				+ ", teacherFartDivisionNo=" + teacherFartDivisionNo + "]";
	}
	
	
	
	
}

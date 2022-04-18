package com.college.member.model.dto;

import java.io.Serializable;

public class TB_GradeDTO implements Serializable {

	private static final long serialVersionUID = -4110308492861488119L;
	
	private String termNo;
	private String studentNo;
	private String classNo;
	private double point;
	
	public TB_GradeDTO() {
	}
	
	public TB_GradeDTO(String termNo, String studentNo, String classNo, double point) {
		this.termNo = termNo;
		this.studentNo = studentNo;
		this.classNo = classNo;
		this.point = point;
	}
	public String getTermNo() {
		return termNo;
	}
	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "TB_GradeDTO [termNo=" + termNo + ", studentNo=" + studentNo + ", classNo=" + classNo + ", point="
				+ point + "]";
	}
	
	
}

package com.college.member.model.dto;

import java.io.Serializable;

public class TB_Class_ProfessorDTO implements Serializable{

	private static final long serialVersionUID = -1300588868886560361L;
	
	private String classNo;
	private String professorNo;
	public TB_Class_ProfessorDTO(String classNo, String professorNo) {
		this.classNo = classNo;
		this.professorNo = professorNo;
	}
	public TB_Class_ProfessorDTO() {
	}
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public String getProfessorNo() {
		return professorNo;
	}
	public void setProfessorNo(String professorNo) {
		this.professorNo = professorNo;
	}
	@Override
	public String toString() {
		return "TB_Class_Professor_DTO [classNo=" + classNo + ", professorNo=" + professorNo + "]";
	}
	
	
}

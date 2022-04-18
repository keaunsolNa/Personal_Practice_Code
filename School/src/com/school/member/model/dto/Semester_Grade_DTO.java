package com.school.member.model.dto;

import java.io.Serializable;

public class Semester_Grade_DTO implements Serializable {

	private static final long serialVersionUID = -7789795486943804635L;
	private int semesterNo;
	private int studentNo;
	private int departmentPartDivisionNo;
	private int departmentDivisionNo;
	private String semesterTerm;
	private int semesterGrade;
	private int semesterRating;
	
	public Semester_Grade_DTO() {
	}
	
	public Semester_Grade_DTO(int semesterNo, int studentNo, int departmentPartDivisionNo, int departmentDivisionNo,
			String semesterTerm, int semesterGrade, int semesterRating) {
		this.semesterNo = semesterNo;
		this.studentNo = studentNo;
		this.departmentPartDivisionNo = departmentPartDivisionNo;
		this.departmentDivisionNo = departmentDivisionNo;
		this.semesterTerm = semesterTerm;
		this.semesterGrade = semesterGrade;
		this.semesterRating = semesterRating;
	}

	public final int getSemesterNo() {
		return semesterNo;
	}

	public final int getStudentNo() {
		return studentNo;
	}

	public final int getDepartmentPartDivisionNo() {
		return departmentPartDivisionNo;
	}

	public final int getDepartmentDivisionNo() {
		return departmentDivisionNo;
	}

	public final String getSemesterTerm() {
		return semesterTerm;
	}

	public final int getSemesterGrade() {
		return semesterGrade;
	}

	public final int getSemesterRating() {
		return semesterRating;
	}

	@Override
	public String toString() {
		return "Semester_Grade_DTO [semesterNo=" + semesterNo + ", studentNo=" + studentNo
				+ ", departmentPartDivisionNo=" + departmentPartDivisionNo + ", departmentDivisionNo="
				+ departmentDivisionNo + ", semesterTerm=" + semesterTerm + ", semesterGrade=" + semesterGrade
				+ ", semesterRating=" + semesterRating + "]";
	}
	
	
}

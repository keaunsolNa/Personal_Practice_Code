package com.school.member.model.dto;

import java.io.Serializable;

public class Mock_Test_Grade_DTO implements Serializable {

	private static final long serialVersionUID = 9187821958304387579L;
	private int MTNo;
	private int studentNo;
	private int departmentPartDivisionNo;
	private int departmentDivisionNo;
	private int MTGrade;
	private String MTTerm;
	private int MTRating;
	
	public Mock_Test_Grade_DTO() {
	}
	public Mock_Test_Grade_DTO(int mTNo, int studentNo, int departmentPartDivisionNo, int departmentDivisionNo,
			int mTGrade, String mTTerm, int mTRating) {
		MTNo = mTNo;
		this.studentNo = studentNo;
		this.departmentPartDivisionNo = departmentPartDivisionNo;
		this.departmentDivisionNo = departmentDivisionNo;
		MTGrade = mTGrade;
		MTTerm = mTTerm;
		MTRating = mTRating;
	}
	public final int getMTNo() {
		return MTNo;
	}
	public final void setMTNo(int mTNo) {
		MTNo = mTNo;
	}
	public final int getStudentNo() {
		return studentNo;
	}
	public final void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public final int getDepartmentPartDivisionNo() {
		return departmentPartDivisionNo;
	}
	public final void setDepartmentPartDivisionNo(int departmentPartDivisionNo) {
		this.departmentPartDivisionNo = departmentPartDivisionNo;
	}
	public final int getDepartmentDivisionNo() {
		return departmentDivisionNo;
	}
	public final void setDepartmentDivisionNo(int departmentDivisionNo) {
		this.departmentDivisionNo = departmentDivisionNo;
	}
	public final int getMTGrade() {
		return MTGrade;
	}
	public final void setMTGrade(int mTGrade) {
		MTGrade = mTGrade;
	}
	public final String getMTTerm() {
		return MTTerm;
	}
	public final void setMTTerm(String mTTerm) {
		MTTerm = mTTerm;
	}
	public final int getMTRating() {
		return MTRating;
	}
	public final void setMTRating(int mTRating) {
		MTRating = mTRating;
	}
	@Override
	public String toString() {
		return "Mock_Test_Grade_DTO [MTNo=" + MTNo + ", studentNo=" + studentNo + ", departmentPartDivisionNo="
				+ departmentPartDivisionNo + ", departmentDivisionNo=" + departmentDivisionNo + ", MTGrade=" + MTGrade
				+ ", MTTerm=" + MTTerm + ", MTRating=" + MTRating + "]";
	}
	
	
}

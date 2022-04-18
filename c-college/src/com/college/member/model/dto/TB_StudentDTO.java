package com.college.member.model.dto;

import java.io.Serializable;
import java.util.Date;

public class TB_StudentDTO implements Serializable{

	private static final long serialVersionUID = -5353919833911105704L;
	
	private String no;
	private int departmentNo;
	private String name;
	private String ssn;
	private String address;
	private java.util.Date entranceDate;
	private String AbsenceYN;
	private String coachProfessorNo;
	
	public TB_StudentDTO() {
	}
	
	public TB_StudentDTO(String no, int departmentNo, String name, String ssn, String address, Date entranceDate,
			String absenceYN, String coachProfessorNo) {
		this.no = no;
		this.departmentNo = departmentNo;
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.entranceDate = entranceDate;
		AbsenceYN = absenceYN;
		this.coachProfessorNo = coachProfessorNo;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public java.util.Date getEntranceDate() {
		return entranceDate;
	}
	public void setEntranceDate(java.util.Date entranceDate) {
		this.entranceDate = entranceDate;
	}
	public String getAbsenceYN() {
		return AbsenceYN;
	}
	public void setAbsenceYN(String absenceYN) {
		AbsenceYN = absenceYN;
	}
	public String getCoachProfessorNo() {
		return coachProfessorNo;
	}
	public void setCoachProfessorNo(String coachProfessorNo) {
		this.coachProfessorNo = coachProfessorNo;
	}
	@Override
	public String toString() {
		return "TB_StudentDTO [no=" + no + ", departmentNo=" + departmentNo + ", name=" + name + ", ssn=" + ssn
				+ ", address=" + address + ", entranceDate=" + entranceDate + ", AbsenceYN=" + AbsenceYN
				+ ", coachProfessorNo=" + coachProfessorNo + "]";
	}
	
	
}

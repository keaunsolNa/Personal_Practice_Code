package com.college.member.model.dto;

import java.io.Serializable;

public class TB_ProfessorDTO implements Serializable{
	
	private static final long serialVersionUID = 8977466135430413428L;
	private String no;
	private String name;
	private String ssn;
	private String address;
	private int departmentNo;
	
	public TB_ProfessorDTO() {
	}
	
	public TB_ProfessorDTO(String no, String name, String ssn, String address, int departmentNo) {
		this.no = no;
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.departmentNo = departmentNo;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
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
	public int getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}
	@Override
	public String toString() {
		return "TB_Class_ProfessorDTO [no=" + no + ", name=" + name + ", ssn=" + ssn + ", address=" + address
				+ ", departmentNo=" + departmentNo + "]";
	}
	
	
	
}

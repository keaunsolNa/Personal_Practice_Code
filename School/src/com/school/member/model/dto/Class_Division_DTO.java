package com.school.member.model.dto;

import java.io.Serializable;

public class Class_Division_DTO implements Serializable{

	private static final long serialVersionUID = -1890087821798103337L;
	private int divisionNo;
	private String divisionName;
	
	public Class_Division_DTO() {
	}

	public Class_Division_DTO(int divisionNo, String divisionName) {
		this.divisionNo = divisionNo;
		this.divisionName = divisionName;
	}

	public int getDivisionNo() {
		return divisionNo;
	}

	public void setDivisionNo(int divisionNo) {
		this.divisionNo = divisionNo;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	@Override
	public String toString() {
		return "Class_Division_DTO [divisionNo=" + divisionNo + ", divisionName=" + divisionName + "]";
	}
	
	
}

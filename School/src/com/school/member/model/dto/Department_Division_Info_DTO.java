package com.school.member.model.dto;

import java.io.Serializable;

public class Department_Division_Info_DTO implements Serializable {

	private static final long serialVersionUID = -2725404502820651508L;
	private int DepartmentDivisionNo;
	private String DepartmentDivisionName;
	
	public Department_Division_Info_DTO() {
	}
	
	public Department_Division_Info_DTO(int departmentDivisionNo, String departmentDivisionName) {
		DepartmentDivisionNo = departmentDivisionNo;
		DepartmentDivisionName = departmentDivisionName;
	}
	public int getDepartmentDivisionNo() {
		return DepartmentDivisionNo;
	}
	public void setDepartmentDivisionNo(int departmentDivisionNo) {
		DepartmentDivisionNo = departmentDivisionNo;
	}
	public String getDepartmentDivisionName() {
		return DepartmentDivisionName;
	}
	public void setDepartmentDivisionName(String departmentDivisionName) {
		DepartmentDivisionName = departmentDivisionName;
	}
	@Override
	public String toString() {
		return "Department_Division_Info_DTO [DepartmentDivisionNo=" + DepartmentDivisionNo
				+ ", DepartmentDivisionName=" + DepartmentDivisionName + "]";
	}
	
	
}

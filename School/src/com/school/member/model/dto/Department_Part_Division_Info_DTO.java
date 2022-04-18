package com.school.member.model.dto;

import java.io.Serializable;

public class Department_Part_Division_Info_DTO implements Serializable{

	private static final long serialVersionUID = -3877334555358571965L;
	private int DepartmentPartDivisionNo;
	private int Department_DivisionNo;
	private String DepartmentName;
	
	public Department_Part_Division_Info_DTO() {
	}

	public Department_Part_Division_Info_DTO(int departmentPartDivisionNo, int department_DivisionNo,
			String departmentName) {
		DepartmentPartDivisionNo = departmentPartDivisionNo;
		Department_DivisionNo = department_DivisionNo;
		DepartmentName = departmentName;
	}

	public int getDepartmentPartDivisionNo() {
		return DepartmentPartDivisionNo;
	}

	public void setDepartmentPartDivisionNo(int departmentPartDivisionNo) {
		DepartmentPartDivisionNo = departmentPartDivisionNo;
	}

	public int getDepartment_DivisionNo() {
		return Department_DivisionNo;
	}

	public void setDepartment_DivisionNo(int department_DivisionNo) {
		Department_DivisionNo = department_DivisionNo;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department_Part_Division_Info_DTO [DepartmentPartDivisionNo=" + DepartmentPartDivisionNo
				+ ", Department_DivisionNo=" + Department_DivisionNo + ", DepartmentName=" + DepartmentName + "]";
	}
	
}

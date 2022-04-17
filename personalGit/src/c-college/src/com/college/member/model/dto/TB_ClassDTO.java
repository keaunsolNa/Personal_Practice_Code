package com.college.member.model.dto;

import java.io.Serializable;

public class TB_ClassDTO implements Serializable{
	
	private static final long serialVersionUID = 460734263089579660L;
	
	private String no;
	private int departmentNo;
	private String preattendingClassNo;
	private String Name;
	private String type;

	public TB_ClassDTO() {
	}
	
	public TB_ClassDTO(String no, int departmentNo, String preattendingClassNo, String name, String type) {
		this.no = no;
		this.departmentNo = departmentNo;
		this.preattendingClassNo = preattendingClassNo;
		Name = name;
		this.type = type;
	}

	public String getNo() {
		return no;
	}

	public int getDepartmentNo() {
		return departmentNo;
	}

	public String getPreattendingClassNo() {
		return preattendingClassNo;
	}

	public String getName() {
		return Name;
	}

	public String getType() {
		return type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}

	public void setPreattendingClassNo(String preattendingClassNo) {
		this.preattendingClassNo = preattendingClassNo;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TB_ClassDTO [no=" + no + ", departmentNo=" + departmentNo + ", preattendingClassNo="
				+ preattendingClassNo + ", Name=" + Name + ", type=" + type + "]";
	}
	
	
}

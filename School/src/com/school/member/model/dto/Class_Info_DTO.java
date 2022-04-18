package com.school.member.model.dto;

import java.io.Serializable;

public class Class_Info_DTO implements Serializable{

	private static final long serialVersionUID = 6854862884180296300L;
	private int classNo;
	private int classDivisionNo;
	private int classTeacherNo;
	private int classCapacity;
	
	public Class_Info_DTO() {
	}
	public Class_Info_DTO(int classNo, int classDivisionNo, int classTeacherNo, int classCapacity) {
		this.classNo = classNo;
		this.classDivisionNo = classDivisionNo;
		this.classTeacherNo = classTeacherNo;
		this.classCapacity = classCapacity;
	}
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	public int getClassDivisionNo() {
		return classDivisionNo;
	}
	public void setClassDivisionNo(int classDivisionNo) {
		this.classDivisionNo = classDivisionNo;
	}
	public int getClassTeacherNo() {
		return classTeacherNo;
	}
	public void setClassTeacherNo(int classTeacherNo) {
		this.classTeacherNo = classTeacherNo;
	}
	public int getClassCapacity() {
		return classCapacity;
	}
	public void setClassCapacity(int classCapacity) {
		this.classCapacity = classCapacity;
	}
	@Override
	public String toString() {
		return "Class_Info_DTO [classNo=" + classNo + ", classDivisionNo=" + classDivisionNo + ", classTeacherNo="
				+ classTeacherNo + ", classCapacity=" + classCapacity + "]";
	}
	
	
}

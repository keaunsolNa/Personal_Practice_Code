package com.school.member.model.dto;

import java.io.Serializable;

public class Parent_Info_DTO implements Serializable{

	private static final long serialVersionUID = -6152621405828675959L;
	private int SPInfo;
	private int SPChildNo;
	private String SPName;
	private String SPPhone;
	
	public Parent_Info_DTO() {
	}
	public Parent_Info_DTO(int sPInfo, int sPChildNo, String sPName, String sPPhone) {
		SPInfo = sPInfo;
		SPChildNo = sPChildNo;
		SPName = sPName;
		SPPhone = sPPhone;
	}
	public int getSPInfo() {
		return SPInfo;
	}
	public void setSPInfo(int sPInfo) {
		SPInfo = sPInfo;
	}
	public int getSPChildNo() {
		return SPChildNo;
	}
	public void setSPChildNo(int sPChildNo) {
		SPChildNo = sPChildNo;
	}
	public String getSPName() {
		return SPName;
	}
	public void setSPName(String sPName) {
		SPName = sPName;
	}
	public String getSPPhone() {
		return SPPhone;
	}
	public void setSPPhone(String sPPhone) {
		SPPhone = sPPhone;
	}
	@Override
	public String toString() {
		return "Parent_Info_DTO [SPInfo=" + SPInfo + ", SPChildNo=" + SPChildNo + ", SPName=" + SPName + ", SPPhone="
				+ SPPhone + "]";
	}
	
	
}

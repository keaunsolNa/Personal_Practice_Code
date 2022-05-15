package com.mvc.dbeloper.model.dto;

import java.io.Serializable;

public class DBeloperManagerDTO implements Serializable {

	private static final long serialVersionUID = 4780012624658594078L;
	private int managerNum;
	private String managerName;
	private String managerGrade;
	private String managerPhone;
	private String managerAddress;
	private String managerId;
	private String managerPwd;
	private int managerSalary;
	private String managerDropYn;
	public DBeloperManagerDTO() {
	}
	public DBeloperManagerDTO(int managerNum, String managerName, String managerGrade, String managerPhone,
			String managerAddress, String managerId, String managerPwd, int managerSalary, String managerDropYn) {
		this.managerNum = managerNum;
		this.managerName = managerName;
		this.managerGrade = managerGrade;
		this.managerPhone = managerPhone;
		this.managerAddress = managerAddress;
		this.managerId = managerId;
		this.managerPwd = managerPwd;
		this.managerSalary = managerSalary;
		this.managerDropYn = managerDropYn;
	}
	public final int getManagerNum() {
		return managerNum;
	}
	public final void setManagerNum(int managerNum) {
		this.managerNum = managerNum;
	}
	public final String getManagerName() {
		return managerName;
	}
	public final void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public final String getManagerGrade() {
		return managerGrade;
	}
	public final void setManagerGrade(String managerGrade) {
		this.managerGrade = managerGrade;
	}
	public final String getManagerPhone() {
		return managerPhone;
	}
	public final void setManagerPhone(String managerPhone) {
		this.managerPhone = managerPhone;
	}
	public final String getManagerAddress() {
		return managerAddress;
	}
	public final void setManagerAddress(String managerAddress) {
		this.managerAddress = managerAddress;
	}
	public final String getManagerId() {
		return managerId;
	}
	public final void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public final String getManagerPwd() {
		return managerPwd;
	}
	public final void setManagerPwd(String managerPwd) {
		this.managerPwd = managerPwd;
	}
	public final int getManagerSalary() {
		return managerSalary;
	}
	public final void setManagerSalary(int managerSalary) {
		this.managerSalary = managerSalary;
	}
	public final String getManagerDropYn() {
		return managerDropYn;
	}
	public final void setManagerDropYn(String managerDropYn) {
		this.managerDropYn = managerDropYn;
	}
	@Override
	public String toString() {
		return "DBeloperManagerDTO [managerNum=" + managerNum + ", managerName=" + managerName + ", managerGrade="
				+ managerGrade + ", managerPhone=" + managerPhone + ", managerAddress=" + managerAddress
				+ ", managerId=" + managerId + ", managerPwd=" + managerPwd + ", managerSalary=" + managerSalary
				+ ", managerDropYn=" + managerDropYn + "]";
	}

	
}

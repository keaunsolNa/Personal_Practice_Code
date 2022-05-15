package com.mvc.dbeloper.model.dto;

import java.io.Serializable;

public class DBeloperMemberDTO implements Serializable{

	private static final long serialVersionUID = -3770255380587349250L;
	private int memNo;
	private String MemName;
	private String memPhone;
	private String memAddress;
	private double memMileage;
	private String memId;
	private String memPwd;
	private String memGradeNo;
	private String memDropYn;
	private int memSumMoney;
	
	public DBeloperMemberDTO() {
	}
	
	public DBeloperMemberDTO(int memNo, String memName, String memPhone, String memAddress, double memMileage,
			String memId, String memPwd, String memGradeNo, String memDropYn, int memSumMoney) {
		this.memNo = memNo;
		MemName = memName;
		this.memPhone = memPhone;
		this.memAddress = memAddress;
		this.memMileage = memMileage;
		this.memId = memId;
		this.memPwd = memPwd;
		this.memGradeNo = memGradeNo;
		this.memDropYn = memDropYn;
		this.memSumMoney = memSumMoney;
	}
	
	public final int getMemNo() {
		return memNo;
	}
	public final void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	public final String getMemName() {
		return MemName;
	}
	public final void setMemName(String memName) {
		MemName = memName;
	}
	public final String getMemPhone() {
		return memPhone;
	}
	public final void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	public final String getMemAddress() {
		return memAddress;
	}
	public final void setMemAddress(String memAddress) {
		this.memAddress = memAddress;
	}
	public final double getMemMileage() {
		return memMileage;
	}
	public final void setMemMileage(double memMileage) {
		this.memMileage = memMileage;
	}
	public final String getMemId() {
		return memId;
	}
	public final void setMemId(String memId) {
		this.memId = memId;
	}
	public final String getMemPwd() {
		return memPwd;
	}
	public final void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}
	public final String getMemGradeNo() {
		return memGradeNo;
	}
	public final void setMemGradeNo(String memGradeNo) {
		this.memGradeNo = memGradeNo;
	}
	public final String getMemDropYn() {
		return memDropYn;
	}
	public final void setMemDropYn(String memDropYn) {
		this.memDropYn = memDropYn;
	}
	public final int getMemSumMoney() {
		return memSumMoney;
	}
	public final void setMemSumMoney(int memSumMoney) {
		this.memSumMoney = memSumMoney;
	}
	public static final long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "DBeloperMemberDTO [memNo=" + memNo + ", MemName=" + MemName + ", memPhone=" + memPhone + ", memAddress="
				+ memAddress + ", memMileage=" + memMileage + ", memId=" + memId + ", memPwd=" + memPwd
				+ ", memGradeNo=" + memGradeNo + ", memDropYn=" + memDropYn + ", memSumMoney=" + memSumMoney + "]";
	}
	
	
	
}

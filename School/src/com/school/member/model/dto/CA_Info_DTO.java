package com.school.member.model.dto;

import java.io.Serializable;

public class CA_Info_DTO implements Serializable{

	private static final long serialVersionUID = 2964380494618666083L;
	private int CANo;
	private String CAName;
	private int CAAdviserTeacherNo;
	
	
	public CA_Info_DTO() {
	}

	public CA_Info_DTO(int cANo, String cAName, int cAAdviserTeacherNo) {
		CANo = cANo;
		CAName = cAName;
		CAAdviserTeacherNo = cAAdviserTeacherNo;
	}

	public int getCANo() {
		return CANo;
	}
	public void setCANo(int cANo) {
		CANo = cANo;
	}
	public String getCAName() {
		return CAName;
	}
	public void setCAName(String cAName) {
		CAName = cAName;
	}
	public int getCAAdviserTeacherNo() {
		return CAAdviserTeacherNo;
	}
	public void setCAAdviserTeacherNo(int cAAdviserTeacherNo) {
		CAAdviserTeacherNo = cAAdviserTeacherNo;
	}
	@Override
	public String toString() {
		return "CA_Info_DTO [CANo=" + CANo + ", CAName=" + CAName + ", CAAdviserTeacherNo=" + CAAdviserTeacherNo + "]";
	}
	
	
}

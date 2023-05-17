package com.example.securityserver.model.domain.user;

import java.io.Serializable
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Date
@Entity
@Table(name = "EMP_BASE")
class EmpBase : Serializable{
	@Id
	var empId: Long? = null

	var userPassword: String? = null

	var companyCd: String? = null

	var empNo: Long? = null

	var ctzNo: String? = null

	var email: String? = null

	var empKindCd: String? = null

	var hireCd: String? = null

	var inOffYn: String? = null

	var genderCd: String? = null

	var birthYmd: Date? = null

	var posCd: String? = null

	var orgCd: String? = null

	var jobCd: String? = null

	var payOrgCd: String? = null

	var tempYn: String? = null

	var hireYmd: Date? = null

	var retireYmd: Date? = null

	var retireTypeCd: String? = null

	var careerNum: Int? = null

	var filePathId: String? = null

	var modUserId: Long? = null

	var modDate: Date? = null

	var tzCd: String? = null

	var tzDate: Date? = null
	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (javaClass != other?.javaClass) return false

		other as EmpBase

		return empId == other.empId
	}

	override fun hashCode(): Int {
		return empId?.hashCode() ?: 0
	}

	override fun toString(): String {
		return "EmpBase(empId=$empId, userPassword=$userPassword, companyCd=$companyCd, empNo=$empNo, ctzNo=$ctzNo, " +
				"email=$email, empKindCd=$empKindCd, hireCd=$hireCd, inOffYn=$inOffYn, genderCd=$genderCd, " +
				"birthYmd=$birthYmd, posCd=$posCd, orgCd=$orgCd, jobCd=$jobCd, payOrgCd=$payOrgCd, " +
				"tempYn=$tempYn, hireYmd=$hireYmd, retireYmd=$retireYmd, retireTypeCd=$retireTypeCd, " +
				"careerNum=$careerNum, filePathId=$filePathId, modUserId=$modUserId, modDate=$modDate, " +
				"tzCd=$tzCd, tzDate=$tzDate)"
	}
}

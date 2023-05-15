package com.example.securityserver.model.domain.user

import lombok.Data
import org.hibernate.annotations.DynamicInsert
import java.sql.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "EMP_BASE")
@DynamicInsert
@Data
class EmpBase {
    @Id
    @Column(name = "EMP_ID")
    private val empId: Long? = null

    @Column(name = "PASSWORD")
    private val password: String? = null

    @Column(name = "COMPANY_CD")
    private val companyCd: String? = null

    @Column(name = "EMP_NO")
    private val empNo: Long? = null

    @Column(name = "EMP_NAME")
    private val empName: String? = null

    @Column(name = "CTZ_NO", nullable = true)
    private val ctzNo: String? = null

    @Column(name = "EMAIL", nullable = true)
    private val email: String? = null

    @Column(name = "EMP_KIND_CD")
    private val empKindCd: String? = null

    @Column(name = "HIRE_CD")
    private val hireCd: String? = null

    @Column(name = "IN_OFF_YN")
    private val inOffYn: String? = null

    @Column(name = "GENDER_CD")
    private val genderCd: String? = null

    @Column(name = "BIRTH_YMD")
    private val birthYmd: Date? = null

    @Column(name = "POS_CD", nullable = true)
    private val posCd: String? = null

    @Column(name = "ORG_CD", nullable = true)
    private val orgCd: String? = null

    @Column(name = "DUTY_CD", nullable = true)
    private val dutyCd: String? = null

    @Column(name = "JOB_CD", nullable = true)
    private val jobCd: String? = null

    @Column(name = "PAY_ORG_CD", nullable = true)
    private val payOrgCd: String? = null

    @Column(name = "TEMP_YN")
    private val tempYn: String? = null

    @Column(name = "HIRE_YMD", nullable = true)
    private val hireYmd: Date? = null

    @Column(name = "RETIRE_YMD", nullable = true)
    private val retireYmd: Date? = null

    @Column(name = "RETIRE_TYPE_CD", nullable = true)
    private val retireTypeCd: String? = null

    @Column(name = "CAREER_NUM", nullable = true)
    private val careerNum: Int? = null

    @Column(name = "FILE_PATH_ID", nullable = true)
    private val filePathId: String? = null

    @Column(name = "MOD_USER_ID")
    private val modUserId: Long? = null

    @Column(name = "MOD_DATE")
    private val modDate: Date? = null

    @Column(name = "TZ_CD")
    private val tzCd: String? = null

    @Column(name = "TZ_DATE")
    private val tzDate: Date? = null
}


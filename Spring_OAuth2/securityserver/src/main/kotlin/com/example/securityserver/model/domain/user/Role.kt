package com.example.securityserver.model.domain.user;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "ROLE")
class Role : Serializable {
    @Id
    @Column(name = "ROLE_AUTHORITY_CODE")
    var roleAuthorityCode: Long? = null

    @Column(name = "EMP_NO")
    var empNo: String? = null

    @ManyToOne
    @JoinColumn(name = "EMP_NO", insertable =false, updatable = false)
    var empBase: EmpBase? = null

    @ManyToOne
    @JoinColumn(name = "ROLE_AUTHORITY_CODE", insertable =false, updatable = false)
    var authority: Authority? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Role

        return roleAuthorityCode == other.roleAuthorityCode
    }

    override fun hashCode(): Int {
        return roleAuthorityCode?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "ROLE(roleAuthorityCode=$roleAuthorityCode, empNo=$empNo, empBase=$empBase, authority=$authority)"
    }
}

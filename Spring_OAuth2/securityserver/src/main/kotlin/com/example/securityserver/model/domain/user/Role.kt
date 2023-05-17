package com.example.securityserver.model.domain.user;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "ROLE")
class Role : Serializable {
    @Id
    var authorityCode: Long? = null

    @Id
    var empNo: String? = null

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = User::class)
    var users: MutableList<User>? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Role

        return authorityCode == other.authorityCode
    }

    override fun hashCode(): Int {
        return authorityCode?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "ROLE(authorityCode=$authorityCode, empNo=$empNo, users=$users)"
    }
}

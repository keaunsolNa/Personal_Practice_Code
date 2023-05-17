package com.example.securityserver.model.domain.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "AUTHORITY")
class Authority : Serializable {
    @Id
    var authorityCode: Int? = null

    var authorityName: String? = null

    var authorityDesc: String? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Authority

        return authorityCode == other.authorityCode
    }

    override fun hashCode(): Int {
        return authorityCode?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Authority(authorityCode=$authorityCode, authorityName=$authorityName, authorityDesc=$authorityDesc)"
    }
}


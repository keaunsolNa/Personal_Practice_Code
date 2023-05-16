package com.example.securityserver.model.domain.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="AUTHORITY")
public class Authority implements Serializable {

    private static final long serialVersionUID = 6064399222664228433L;

    @Id
    @Column(name = "AUTHORITY_CODE")
    private int AuthorityCode;

    @Column(name = "AUTHORITY_NAME", nullable = false, unique = true)
    private String authorityName;

    @Column(name = "AUTHORITY_DESC")
    private String authorityDesc;

    public Authority() {

    }

    public int getAuthorityCode() {
        return AuthorityCode;
    }

    public void setAuthorityCode(int authorityCode) {
        AuthorityCode = authorityCode;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public String getAuthorityDesc() {
        return authorityDesc;
    }

    public void setAuthorityDesc(String authorityDesc) {
        this.authorityDesc = authorityDesc;
    }

    public Authority(int authorityCode, String authorityName, String authorityDesc) {
        AuthorityCode = authorityCode;
        this.authorityName = authorityName;
        this.authorityDesc = authorityDesc;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "AuthorityCode=" + AuthorityCode +
                ", authorityName='" + authorityName + '\'' +
                ", authorityDesc='" + authorityDesc + '\'' +
                '}';
    }
}

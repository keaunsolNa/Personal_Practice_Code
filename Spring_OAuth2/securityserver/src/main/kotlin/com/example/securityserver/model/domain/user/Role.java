package com.example.securityserver.model.domain.user;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Embeddable
@Entity
@Table(name="ROLE")
public class Role implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -2442439253944382064L;

    @Id
    @Column(name = "AUTHORITY_CODE")
    private Long authorityCode;

    @Column(name = "EMP_NO")
    private String empNo;

    @ManyToMany(mappedBy="ROLE")
    private List<User> user;

    public Role() {

    }

    public Long getAuthorityCode() {
        return authorityCode;
    }

    public void setAuthorityCode(Long authorityCode) {
        this.authorityCode = authorityCode;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public Role(Long authorityCode, String empNo, List<User> user) {
        this.authorityCode = authorityCode;
        this.empNo = empNo;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Role{" +
                "authorityCode=" + authorityCode +
                ", empNo='" + empNo + '\'' +
                ", user=" + user +
                '}';
    }
}


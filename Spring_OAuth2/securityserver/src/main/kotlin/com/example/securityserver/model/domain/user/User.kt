package com.example.securityserver.model.domain.user;

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.io.Serializable
import java.sql.Date
import javax.persistence.*

@Entity
@Table(name = "EMP_BASE")
class User : Serializable, UserDetails {

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

    @ManyToMany(cascade = [CascadeType.MERGE])
    @JoinTable(
        name = "ROLE",
        joinColumns = [JoinColumn(name = "EMP_NO", referencedColumnName = "EMP_ID")],
        inverseJoinColumns = [JoinColumn(name = "AUTHORITY_CODE", referencedColumnName = "ROLE_AUTHORITY_CODE")]
    )
    var roles: MutableList<Authority>? = null

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        val authorities = mutableListOf<GrantedAuthority>()
        roles?.forEach { authority ->
            authorities.add(SimpleGrantedAuthority(authority.authorityName))
        }
        return authorities
    }

    override fun getPassword(): String? {
        return userPassword
    }

    override fun getUsername(): String? {
        return empId.toString()
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }


}

package com.example.securityserver.service

import com.example.securityserver.model.domain.user.User
import com.example.securityserver.model.repository.login.LoginRepository
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UsernameNotFoundException


private val loginRepository: LoginRepository? = null

class LoginServiceImpl : LoginService {
    override fun loadUserByUsername(empId: String): UserDetails {
        val user: User? = loginRepository?.findByEmpId(empId.toLong())

        return org.springframework.security.core.userdetails.User(
            user?.empId .toString(),
            user?.userPassword, getAuthorities(user)
        )
    }

    private fun getAuthorities(user: User?): Collection<GrantedAuthority?>? {
        val userRoles: Array<out String?>? = user?.roles
            ?.stream()
            ?.map { role -> role.authorityCode }
            ?.toArray { size -> arrayOfNulls<String>(size) }

        val nonNullRoles = userRoles?.filterNotNull()
        val authorities = AuthorityUtils.createAuthorityList(*nonNullRoles?.toTypedArray() ?: null )
        return authorities
    }
}
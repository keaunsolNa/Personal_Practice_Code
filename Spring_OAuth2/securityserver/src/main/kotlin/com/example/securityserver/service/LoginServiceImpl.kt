package com.example.securityserver.service

import com.example.securityserver.model.domain.user.User
import com.example.securityserver.model.repository.login.LoginRepository
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Service


private val loginRepository: LoginRepository? = null

@Service
class LoginServiceImpl : LoginService {

    // Spring Security Override 인증 Function
    override fun loadUserByUsername(empId: String): UserDetails {

        println("loadUserByUsername")
        // parameter EmpID(UK값으로 대체 가능)로 DATA JPA SELECT 시행
        val user: User? = loginRepository?.findByEmpId(empId.toLong())

        println(user)
        return org.springframework.security.core.userdetails.User(

            // 조회한 User 객체의 ID, PASSWORD 반환
            user?.empId .toString(),
            user?.userPassword, getAuthorities(user)
        )
    }

    // Spring Security 권한 객체 가져오기
    private fun getAuthorities(user: User?): Collection<GrantedAuthority?>? {

        // User 객체의 @OneToMany로 Role 테이블의 권한 가져온다.
        val userRoles: Array<out String?>? = user?.roles

            // Stream으로 배열에서 값을 꺼내와 role 객체 생성
            ?.stream()
            ?.map { role -> role.roleAuthorityCode }
            ?.toArray { size -> arrayOfNulls<String>(size) }

        // NPE 방지 Null List 객체 생성
        val nonNullRoles = userRoles?.filterNotNull()

        // 가져온 권한이 있을 때만 채운다.
        val authorities = AuthorityUtils.createAuthorityList(*nonNullRoles?.toTypedArray() ?: null )
        return authorities
    }

    // 토큰의 ID로 유저 정보 가져오기
    override fun getUser(userId: String): User? {

        println("Get User")
        println(userId is String)
        println(userId)
        val employee: User? = loginRepository!!.findByEmpId(userId.toLong())

        println("After JPA")
        println(employee)

        return employee ?: null
    }

}
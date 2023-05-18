package com.example.securityserver.model.repository.login

import com.example.securityserver.model.domain.user.User
import org.springframework.data.jpa.repository.JpaRepository

interface LoginRepository : JpaRepository<User, Long> {
    fun findByEmpId(empId: Long?): User?
}

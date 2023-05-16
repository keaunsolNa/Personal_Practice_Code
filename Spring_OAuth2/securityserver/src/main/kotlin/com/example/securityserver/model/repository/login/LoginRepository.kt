package com.example.securityserver.model.repository.login

import com.example.securityserver.model.domain.user.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.security.core.userdetails.UserDetails

interface LoginRepository : JpaRepository<User, String> {
    fun findByUsername(username: String): UserDetails?
}


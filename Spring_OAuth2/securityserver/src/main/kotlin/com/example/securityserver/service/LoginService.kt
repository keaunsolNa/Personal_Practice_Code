package com.example.securityserver.service

import com.example.securityserver.model.domain.user.EmpBase
import com.example.securityserver.model.domain.user.User
import org.springframework.security.core.userdetails.UserDetailsService


interface LoginService : UserDetailsService {
    fun getUser(userId: String): User?
}


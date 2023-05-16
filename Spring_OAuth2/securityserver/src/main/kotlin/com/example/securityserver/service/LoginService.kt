package com.example.securityserver.service

import com.example.securityserver.model.domain.user.EmpBase
import com.example.securityserver.model.domain.user.User
import java.util.*

interface LoginService {

    fun getUser(userId: String?): Optional<User?>?
}
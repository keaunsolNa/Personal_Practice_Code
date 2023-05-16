//package com.example.securityserver.service
//
//import com.example.securityserver.model.domain.user.EmpBase
//import com.example.securityserver.model.domain.user.User
//import com.example.securityserver.model.repository.login.LoginRepository
//
//import java.util.*
//
//
//class LoginServiceImpl {
//
//    private val loginRepositroy: LoginRepository? = null
//    // 사원 정보 가져오기
//    fun getUser(userId: String): Optional<User>? {
//        return loginRepositroy?.findById(userId.toLong())
//    }
//}
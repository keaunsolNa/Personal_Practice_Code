package com.example.securityserver.model.repository.login

import com.example.securityserver.model.domain.user.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository : JpaRepository<Account, Long?> {

    fun findByNumber(number: String): Account?
}
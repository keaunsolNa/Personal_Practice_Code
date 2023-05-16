package com.example.securityserver.model.repository.login

import com.example.securityserver.model.domain.user.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long?> {

    fun findByEmail(email: String): User?
}

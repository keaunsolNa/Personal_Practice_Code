// User.kt
package com.example.securityserver.model.domain.user

import javax.persistence.*

@Entity
@Table(name = "user")
class User(username: String, email: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var username: String = username
    var email: String = email

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "User(id=$id, name='$username', email='$email')"
    }
}
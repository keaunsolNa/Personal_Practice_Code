// Account.kt
package com.example.securityserver.model.domain.user

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "account")
class Account(user: User, number: String, balance: BigDecimal) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT))
    var user: User = user
    var number: String = number
    var balance: BigDecimal = balance

    fun withDraw(money: BigDecimal): BigDecimal {
        this.balance = this.balance.minus(money)
        return this.balance
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Account

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }
}
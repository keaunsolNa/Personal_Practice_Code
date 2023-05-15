package com.example.securityserver.model.domain.user

import lombok.Getter
import lombok.Setter
import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "AUTHORITY")
@Getter
@Setter
class Authority : Serializable {
    @Id
    @Column(name = "AUTHORITY_CODE")
    private val AuthorityCode = 0

    @Column(name = "AUTHORITY_NAME", nullable = false, unique = true)
    private val authorityName: String? = null

    @Column(name = "AUTHORITY_DESC")
    private val authorityDesc: String? = null

    companion object {
        private const val serialVersionUID = 6064399222664228433L
    }
}


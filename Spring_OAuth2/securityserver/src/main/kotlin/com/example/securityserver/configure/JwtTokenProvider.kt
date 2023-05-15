package com.example.securityserver.configure

import com.example.securityserver.model.domain.user.Authority
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import lombok.RequiredArgsConstructor
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Component
import java.util.*
import javax.annotation.PostConstruct
import javax.servlet.http.HttpServletRequest


@RequiredArgsConstructor
@Component
class JwtTokenProvider {
    private var secretKey = "hrtestSystemBykeaunsolhrtestSystemBykeaunsolhrtestSystemBykeaunsol"

    // 토큰 유효시간 300분
    private val tokenValidTime = 300 * 60 * 1000L
    private val userDetailsService: UserDetailsService? = null

    // 객체 초기화, secretKey를 Base64로 인코딩한다.
    @PostConstruct
    protected fun init() {
        secretKey = Base64.getEncoder().encodeToString(secretKey.toByteArray())
    }

    // JWT 토큰 생성
    fun createToken(userPk: String?, roles: List<Authority?>): String {
        val claims = Jwts.claims().setSubject(userPk) // JWT payload 에 저장되는 정보단위
        claims["roles"] = roles
        val now = Date()
        return Jwts.builder()
            .setClaims(claims)
            .setIssuedAt(now)
            .setExpiration(Date(now.time + tokenValidTime))
            .signWith(SignatureAlgorithm.HS512, secretKey)
            .compact()
    }

    // JWT 토큰에서 인증 정보 조회
    fun getAuthentication(token: String?): Authentication {
        val userDetails = userDetailsService!!.loadUserByUsername(getUserPk(token))
        return UsernamePasswordAuthenticationToken(userDetails, "", userDetails.authorities)
    }

    // 토큰에서 회원 정보 추출
    fun getUserPk(token: String?): String {
        return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).body.subject
    }

    // Request의 Header에서 token 값을 가져옵니다. "X-AUTH-TOKEN" : "TOKEN값'
    fun resolveToken(request: HttpServletRequest): String {
        return request.getHeader("X-AUTH-TOKEN")
    }

    // 토큰의 유효성 + 만료일자 확인
    fun validateToken(jwtToken: String?): Boolean {
        return try {
            val claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(jwtToken)
            !claims.body.expiration.before(Date())
        } catch (e: Exception) {
            false
        }
    }
}
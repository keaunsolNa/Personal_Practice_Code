package com.example.securityserver.component.provider

import io.jsonwebtoken.*
import lombok.RequiredArgsConstructor
import org.slf4j.Logger
import org.slf4j.LoggerFactory
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
    private var userDetailsService: UserDetailsService? = null;

    // 토큰 유효시간 설정
    private val tokenValidTime = 300 * 60 * 1000L
    private val logger = LoggerFactory.getLogger(JwtTokenProvider::class.java)

    // 객체 초기화, secretKey를 Base64로 인코딩한다.
    @PostConstruct
    protected fun init() {
        secretKey = Base64.getEncoder().encodeToString(secretKey.toByteArray())
    }

    // JWT 토큰 생성
    fun createToken(userPk: String, roles: List<String?>): String {
    
        // JWT payload 에 저장되는 정보단위
        val claims: Claims = Jwts.claims().setSubject(userPk)

        // PK값인 userID와 권한을 담는다.
        claims["userPk"] = userPk
        claims["roles"] = roles

        val now = Date()

        // 토큰 빌더
        return Jwts.builder()
            .setClaims(claims)
            .setIssuedAt(now)
            .setExpiration(Date(now.time + tokenValidTime))

            // 암호화 수준. HS512 알고리즘, secretKey는 임시로 지정 (추후 yml 파일로)
            .signWith(SignatureAlgorithm.HS512, secretKey)
            .compact()
    }

    // JWT 토큰에서 인증 정보 조회
    fun getAuthentication(token: String): Authentication {

        // Spring UserDetailsService를 상속받은 loadUserByUsername 메서드로 User 객체를 가져온다.
        val userDetails = userDetailsService?.loadUserByUsername(this.getUserPk(token));

        // User 객체와 권한 반환
        return UsernamePasswordAuthenticationToken(userDetails, "", userDetails?.authorities)
    }

    // 토큰에서 회원 정보 추출
    fun getUserPk(token: String): String {

        // 토큰에서 PK 값인 userID 가져오기.
        return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).body.subject
    }

    // Request의 Header에서 token 값을 가져온다. "X-AUTH-TOKEN" : "TOKEN값'
    fun resolveToken(request: HttpServletRequest): String? {

        // jwt 토큰 종류는 X-AUTH_TOKEN
        return request.getHeader("X-AUTH-TOKEN")
    }

    // 토큰의 유효성 확인
    fun validateToken(jwtToken: String): Boolean {

        try {

            val claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(jwtToken)
            !claims.body.expiration.before(Date())

            return true;

        } catch (e: SecurityException ) {
            logger.info("잘못된 JWT 서명입니다. ")
        } catch (e: ExpiredJwtException) {
            logger.info("만료된 JWT 토큰입니다.");
        } catch (e: UnsupportedJwtException) {
            logger.info("지원되지 않는 JWT 토큰입니다.");
        } catch (e: IllegalArgumentException) {
            logger.info("JWT 토큰이 잘못되었습니다.");
        }
        return false

    }
}
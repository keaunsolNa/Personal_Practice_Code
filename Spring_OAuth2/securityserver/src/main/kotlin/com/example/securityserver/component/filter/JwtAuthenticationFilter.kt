package com.example.securityserver.component.filter

import com.example.securityserver.configure.JwtTokenProvider
import lombok.RequiredArgsConstructor
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.filter.GenericFilterBean
import java.io.IOException
import javax.servlet.FilterChain
import javax.servlet.ServletException
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest


@RequiredArgsConstructor
class JwtAuthenticationFilter : GenericFilterBean() {
    private val jwtTokenProvider: JwtTokenProvider? = null

    @Throws(IOException::class, ServletException::class)
    override fun doFilter(request: ServletRequest, response: ServletResponse, chain: FilterChain) {
        // 헤더에서 JWT 를 받아옵니다.

        if(jwtTokenProvider != null){

            val token: String = jwtTokenProvider.resolveToken(request as HttpServletRequest)

            // 유효한 토큰인지 확인합니다.
            if (token != null && jwtTokenProvider.validateToken(token)) {
                // 토큰이 유효하면 토큰으로부터 유저 정보를 받아옵니다.
                val authentication: Authentication = jwtTokenProvider.getAuthentication(token)
                // SecurityContext 에 Authentication 객체를 저장합니다.
                SecurityContextHolder.getContext().authentication = authentication
            }

            chain.doFilter(request, response)
        }
    }
}
package com.example.securityserver.component.filter

import com.example.securityserver.component.provider.JwtTokenProvider
import lombok.RequiredArgsConstructor
import org.springframework.context.annotation.Bean
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
class JwtAuthenticationFilter(private val jwtTokenProvider: JwtTokenProvider) : GenericFilterBean() {

    @Throws(IOException::class, ServletException::class)
    override fun doFilter(request: ServletRequest, response: ServletResponse, chain: FilterChain) {

        println("doFilter")

        // 헤더에서 JWT 를 받아오기
        val token: String? = jwtTokenProvider.resolveToken(request as HttpServletRequest)

        println("token")
        println(token)

            // 토큰 검증
            if(token != null && jwtTokenProvider.validateToken(token)){

                // 토큰이 유효하면 토큰으로부터 유저 정보를 받아온다.
                val authentication: Authentication = jwtTokenProvider.getAuthentication(token)

                // SecurityContext 에 Authentication 객체를 저장.
                SecurityContextHolder.getContext().authentication = authentication

            }

            chain.doFilter(request, response)
    }
}
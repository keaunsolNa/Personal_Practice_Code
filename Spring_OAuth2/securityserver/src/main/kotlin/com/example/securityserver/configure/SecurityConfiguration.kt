package com.example.securityserver.configure

import com.example.securityserver.component.filter.JwtAuthenticationFilter
import com.example.securityserver.component.provider.JwtTokenProvider
import lombok.RequiredArgsConstructor
import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.factory.PasswordEncoderFactories
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter

// Spring Security Filter Configuration
@RequiredArgsConstructor
@EnableWebSecurity
class SecurityConfiguration(private val jwtTokenProvider: JwtTokenProvider) {

    // WebSecurityConfigurerAdapter는 Deprecate 되었기에 SecurityFilterChain를 상속받아 구현한다.
    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {

        // crsf 설정은 원활한 테스트를 위해 disable 처리.
        http.csrf().disable()

        // 권한에 따른 페이지 입장 가능. 현재는 React에서 토큰에 있는 권한에 따라 처리하는 로직으로 수행 중.
        http
            .authorizeRequests { requests ->
                requests
                    // React에서 권한 처리를 하기에 모든 Request를 수용한다.
                    .anyRequest().permitAll()
            }

            // 세션 비활성화 (localStorage 사용)
            .sessionManagement { management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS) }

            // 인증 절차는 JwtAuthenticationFilter Filter를 통해 request의 token 객체로 검증.
            .addFilterBefore(JwtAuthenticationFilter(jwtTokenProvider), UsernamePasswordAuthenticationFilter::class.java)

        // http로 빌드
        return http.build()
    }

    // Spring Security가 제공하는 기본 비크립트 Matcher
    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder()
    }
}
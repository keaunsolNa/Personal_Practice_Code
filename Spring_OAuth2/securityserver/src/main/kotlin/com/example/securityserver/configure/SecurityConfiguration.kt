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


@RequiredArgsConstructor
@EnableWebSecurity
class SecurityConfiguration(private val jwtTokenProvider: JwtTokenProvider) {

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {

        println("filterChain")

        http.csrf().disable()
//            .csrf().ignoringAntMatchers("/h2-console/**").disable()
//            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)	// 세션 비활성화

        http
            .authorizeRequests { requests ->
                requests
                    .antMatchers("/user/**").authenticated()
                    .antMatchers("/manager/**").access("hasRole('ROLE_EMPLOYEE')")
                    .anyRequest().permitAll()
            }
            .sessionManagement { management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS) }
            .addFilterBefore(JwtAuthenticationFilter(jwtTokenProvider), UsernamePasswordAuthenticationFilter::class.java)

        return http.build()
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder()
    }
}
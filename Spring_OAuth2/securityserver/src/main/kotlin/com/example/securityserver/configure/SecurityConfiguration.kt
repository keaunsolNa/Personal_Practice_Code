package com.example.securityserver.configure

import com.example.securityserver.component.provider.JwtTokenProvider
import lombok.RequiredArgsConstructor
import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.factory.PasswordEncoderFactories
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain


@RequiredArgsConstructor
@EnableWebSecurity
class SecurityConfiguration {
    private val jwtTokenProvider: JwtTokenProvider? = null
    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {

        println("filterChain")
        http.httpBasic().disable()
            .csrf().ignoringAntMatchers("/h2-console/**").disable()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)	// 세션 비활성화

        http.formLogin()
            .loginProcessingUrl("/login")
            .usernameParameter("empId")
            .passwordParameter("password")

        http
            .authorizeRequests { requests ->
                requests
                    .antMatchers("/user/**").authenticated()
                    .antMatchers("/manager/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_MANAGER')")
                    .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
                    .anyRequest().permitAll()
            }
            .sessionManagement { management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS) }

        return http.build()
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder()
    }
}
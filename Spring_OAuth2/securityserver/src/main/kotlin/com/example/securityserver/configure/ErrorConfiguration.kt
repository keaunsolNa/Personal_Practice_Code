package com.example.securityserver.configure

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory
import org.springframework.boot.web.server.ErrorPage
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpStatus

@Configuration
class ErrorConfiguration {
    @Bean
    fun webServerFactory(): ConfigurableServletWebServerFactory {
        val factory = TomcatServletWebServerFactory()
        factory.addErrorPages(ErrorPage(HttpStatus.NOT_FOUND, "/error"))
        return factory
    }
}


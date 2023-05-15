package com.example.securityserver.configure

import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


// 스프링 서버 전역적으로 CORS 설정
@Configuration
class WebConfiguration : WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {

        println("addCorsMappings")
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:8088", "http://localhost:3000") // 허용할 출처
            .allowedMethods("GET", "POST") // 허용할 HTTP method
            .allowCredentials(true) // 쿠키 인증 요청 허용
            .maxAge(3000) // 원하는 시간만큼 pre-flight 리퀘스트를 캐싱
    }
}
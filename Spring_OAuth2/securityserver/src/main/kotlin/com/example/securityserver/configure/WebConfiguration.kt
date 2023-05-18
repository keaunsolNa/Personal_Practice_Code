package com.example.securityserver.configure

import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

// 스프링 서버 전역적으로 CORS 설정할 WebMvcConfigurer 상속 Class
@Configuration
class WebConfiguration : WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {

        registry.addMapping("/**")
            // 허용할 출처
            .allowedOrigins("http://localhost:8088", "http://localhost:3000")
            // 허용할 HTTP method
            .allowedMethods("GET", "POST")
            // 쿠키 인증 요청 허용
            .allowCredentials(true)
            // 원하는 시간만큼 pre-flight 리퀘스트를 캐싱
            .maxAge(3000)
    }
}
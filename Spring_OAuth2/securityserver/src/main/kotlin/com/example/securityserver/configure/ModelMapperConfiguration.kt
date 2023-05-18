package com.example.securityserver.configure

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration


// ModelMapper Component
@Configuration
@ComponentScan("com.example.securityserver")
class ModelMapperConfiguration {
    @Bean
    fun modelMapper(): ModelMapper {
        return ModelMapper()
    }
}


package com.example.demo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = {"com.example.demo"})
@EnableJpaRepositories(basePackages = "com.ohgiraffers.datajpa")
public class JPAConfiguration {
	
}
package com.example.securityserver.configure

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = ["com.example.securityserver"])
@EnableJpaRepositories(basePackages = ["com.example.securityserver"])
public class JPAConfiguration {

}

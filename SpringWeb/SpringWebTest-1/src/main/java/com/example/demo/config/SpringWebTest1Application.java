package com.example.demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo"})
public class SpringWebTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebTest1Application.class, args);
	}

}

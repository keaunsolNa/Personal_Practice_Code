package com.example.securityserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class SecurityserverApplication

fun main(args: Array<String>) {
	runApplication<SecurityserverApplication>(*args)
}

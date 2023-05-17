package com.example.securityserver.component.aop

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Component

@Aspect
@Component
class JpaQueryLoggingAspect {

    @Before("execution(* com.example.securityserver.repository.*.*(..)) && @annotation(queryAnnotation)")
    fun beforeExecutionRepository(joinPoint: JoinPoint, queryAnnotation: Query) {
        val methodName = joinPoint.signature.name
        val queryString = queryAnnotation.value

        // 쿼리 실행 전에 로그로 출력
        println("Before executing JPA query: $methodName - $queryString")
    }

    @Before("execution(* com.example.securityserver.controller.*.*(..))")
    fun beforeExecutionController(joinPoint: JoinPoint) {

        println("Controller Execution")
    }

    @AfterReturning(
        pointcut = "execution(* com.example.securityserver.repository.*.*(..)) && @annotation(queryAnnotation)",
        returning = "result"
    )
    fun afterReturningExecutionRepository(joinPoint: JoinPoint, queryAnnotation: Query, result: Any?) {
        val methodName = joinPoint.signature.name
        val queryString = queryAnnotation.value

        // 쿼리 실행 후에 로그로 출력
        println("After executing JPA query: $methodName - $queryString")
        println("Query result: $result")
    }
}
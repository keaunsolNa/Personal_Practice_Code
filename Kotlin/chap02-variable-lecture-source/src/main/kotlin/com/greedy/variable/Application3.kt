package com.greedy.variable

/*
    코틀린에서 제공하는 타입의 종류와 저장 가능 크기를 알아보자.
    코틀린의 경우는 정수형(Byte, Short, Int, Long)과 실수형(Float, Double)은 저장 크기를 확인할 수도 있다.
 */
fun main(args: Array<String>) {
    var score: Int = 100

    println("정수형 값의 최소/최대값")
    println("Byte min: ${Byte.MIN_VALUE} max: ${Byte.MAX_VALUE}")
    println("Short min: ${Short.MIN_VALUE} max: ${Short.MAX_VALUE}")
    println("Int min: ${Int.MIN_VALUE} max: ${Int.MAX_VALUE}")
    println("Long min: ${Long.MIN_VALUE} max: ${Long.MAX_VALUE}")

    println("실수형 값의 최소/최대값")
    println("Float min: ${Float.MIN_VALUE} max: ${Float.MAX_VALUE}")
    println("Double min: ${Double.MIN_VALUE} max: ${Double.MAX_VALUE}")

    println("문자형 값의 최소/최대값")
    println("Char min: ${Char.MIN_VALUE.toInt()} max: ${Char.MAX_VALUE.toInt()}")

    println("논리형 값의 최소/최대값")
//    println("Boolean min: ${Boolean.MIN_VALUE} max: ${Boolean.MAX_VALUE}")          // 에러. 논리형은 저장 크기를 따로 알 수 없다.
}

package com.keaunsol.function

/*
    람다식이란?
    익명함수(이름 없는 함수)의 형태로 화살표 표기법을 사용한다.

    람다식의 구성
    val 함수처럼 사용 할 변수: 람다식의 선언 자료형 -> 람다식의 반환 자료형 {람다식의 매개변수 -> 람다식의 처리 내용}

    1. 전체 모습
    val plus: (Int, Int) -> Int = { x: Int, y: Int -> x * y }

    2. :로 선언된 선언 자료형 생략
    val plus = { x: Int, y: Int -> x * y}

    3. :이후 선언 자료형 생략
    val plus: (Int, Int) -> Int = { x, y -> x * y }
 */
fun main(args: Array<String>) {
    /* 매개변수 있고 반환형도 있는 람다식 */
    val square: (Int) -> Int = { number: Int -> number * number }
//    val square = { number: Int -> number * number }
    println(square(4))

    /* 매개변수 없고 반환형도 없는 람다식 */
//    var printHello: () -> Unit = {println("hello")}
    var printHello = {println("hello")}
    printHello()

    /* it을 활용한 축약형(매개변수가 하나일 때 주로 사용) */
    var sayHelloTo: (String) -> Unit = { println("say hello to $it") }
    sayHelloTo("김철수")

}
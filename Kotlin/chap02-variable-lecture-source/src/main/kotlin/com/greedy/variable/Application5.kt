package com.greedy.variable

/*
    Any타입
    모든 타입의 값을 대입할 수 있는 최상위 타입
    Any 타입 변수에는 초기화 이후에도 어떤 종류의 값이든 대입이 가능
 */
fun main(args: Array<String>) {

    /* Any 타입 변수 선언 */
    var anyValue: Any

    /* 대입 후 타입이 정해짐 */
    anyValue = 100;


    /* ::class.simpleName으로 코틀린의 타입을 확인할 수 있다. */
    println(anyValue::class.simpleName)

    /* 문자열 대입 */
    anyValue = "Hello"
    println(anyValue::class.simpleName)

    /* 실수형 숫자 대입 */
    anyValue = 1.234
    println(anyValue::class.simpleName)

}
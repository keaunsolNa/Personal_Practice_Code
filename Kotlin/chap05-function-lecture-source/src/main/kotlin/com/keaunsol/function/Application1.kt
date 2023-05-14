package com.keaunsol.function

/* 코틀린 함수의 종류 */
fun main(args: Array<String>) {
    printHello()
    println(getHello())

    print(sum(4, 5))

    println(getGrade(83))
    println(getBigger(10, 20))
    println(removeAllSpace("코틀린 함수를 배우고 있군요!"))
}

/* 매개변수 및 반환형이 없는 함수 */
fun printHello(){

}


/* 매개변수 없고 반환형 있는 함수 */
fun getHello(): String {
    return "Hello"
}

/* 매개변수 있고 반환값도 있는 함수 */
//fun sum(a: Int, b: Int): Int {
//    return a + b
//}

/* 표현식(변수, 상수, 연산자, 함수로 구성되어 어떤 하나의 값을 만들어 내는 문장)을 활용한 함수 정의 기능 */
//fun sum(a: Int, b: Int): Int = a + b
fun sum(a: Int, b: Int) = a + b         // 표현식의 결과를 통해 반환형 유추가 가능하면 반환형 생략 가능

/* 조건문을 표현식으로 활용한 함수 정의 */
fun getGrade(score: Int) = when(score) {
    in 91..100 -> "A"
    in 81..90  -> "B"
    in 71..80 -> "C"
    else -> "D"
}

fun getBigger(a: Int, b: Int): Int = if(a > b) a else b

/* 함수 호출을 표현식으로 활용한 함수 정의 */
fun removeAllSpace(target: String): String = target.replace(" ", "")
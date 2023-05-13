package com.keaunsol.operator

fun main(args: Array<String>) {

    /* in 연산자 */
    /* 1. 배열, 리스트, 집합 혹은 Range 객체(범위 객체)에 특정 원소가 포함되어 있는지 검사하기 위해 사용 */
    /* 배열 요소 포함 여부 검사 */
    var arr = arrayOf(1, 2, 3, 4, 5)

    println("3 in arr: " + (3 in arr))
    println("6 in arr: " + (6 in arr))

    /* 리스트 요소 포함 여부 검사 */
    var list = listOf('a', 'b', 'c', 'd', 'e')

    println("'a' in list: ${'a' in list}")
    println("'f' in list: ${'f' in list}")

    /* 범위 객체 요소 포함 여부 검사 */
    println(1 in 1..10)

    var a = 9
    println(a in 1..9)

    println('a' in 'a'..'z')

    /* 범위 객체는 반복문에서 자주 사용하게 된다. */
    for(num in 1..5){       // in 연산자를 통해 우항의 값을 좌항에 각각 대입 시킴
        println("$num")
    }
    println()

    var items = arrayOf('a', 'b', 'c')
    for(it in items) {
        println(it)
    }
    println()

    /* !를 사용해서 in 연산자를 부정할 수도 있다. */
    println(1 !in 1..10)


}
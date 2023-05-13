package com.greedy.variable
/*
    배열
    같은 타입의 값을 여러 개 저장하고 관리하기 위해 사용(Any 타입 사용 시에는 여러 타입도 가능)
    배열을 사용하는 방법
    1. 한가지 배열의 초기값과 크기를 지정 후 생성(Array)
    2. 원시 타입값을 저장하는 배열 생성(기본자료형arrayOf)
    3. 래퍼 타입값을 저장하는 배열 생성(arrayOf)
 */

fun main(args: Array<String>) {

    /* 1. */
    /* Int형만 저장하는 크기 3에 초기값 1로 채워진 배열 선언 */
    var arr1: Array<Int> = Array<Int>(3){1}
    println(arr1[0])
    println(arr1[1])
    println(arr1[2])

    /* 모든 자료형을 받아줄 수 있는 크기 2에 초기값 1로 채워진 배열 선언 */
    var arr2: Array<Any> = Array<Any>(2){1}
    arr2[1] = "Hello"
    println(arr2[0])
    println(arr2[1])

    // 모든 자료형을 받아줄 수 있는 크기 2에 각각 다른 자료형의 값들이 채워진 배열 선언 */
    var arr3: Array<Any> = arrayOf(1.234, "Hello")
    println(arr3[0])
    println(arr3[1])

    /* 2. */
    var intArr = intArrayOf(1, 2, 3)
//    var intArr = intArrayOf(1, 2, null)     // 원시 타입 배열이므로 null은 저장 안됨
    println(intArr[0])
    println(intArr.javaClass.canonicalName)         // 자바에서의 타입 확인 (int[])

    var charArr = charArrayOf('a', 'b', 'c')
    println(charArr.javaClass.canonicalName)        // char[]

    /* 3. */
    var intWrapperArr = arrayOf(1, 2, 3)
    println(intWrapperArr.javaClass.canonicalName)  // java.lang.Integer[]


}

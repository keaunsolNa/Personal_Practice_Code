package com.greedy.variable

/* 상수(const val)와 읽기 전용 변수(val) */
class Student {}

const val PI = 3.1415       // 전역 변수로 선언 가능

val lecture = "kotlin"      // 전역 변수로 선언 가능

//const val student: Student = Student()      // 기본자료형과 String 형을 제외한 참조 자료형으로 선언 불가능
fun main(args: Array<String>) {

    /* 1. 지역 변수는 읽기 전용 변수(val)만 가능하다. */
    /* const val */
//    const val PI = 3.1415  // 지역 변수로는 선언 불가능
//    PI = 3.14              // 전역 변수로 선언된 상수는 수정 불가능
    println((PI))

    /* val */
    val lecture2 = "android"    // val은 지역변수로 선언 가능
//    lecture2 = "java"         // 읽기 전용 변수이므로 수정 불가능 (읽기만 가능)

    /* 2. 기본자료형이나 String을 제외한 자료형으로 변수를 선언하려면 읽기 전용 변수(val)만 가능하다. */
    val student: Student = Student()    // 생성자를 활용해 객체를 생성할 때 new를 사용하지 않는다.
    println(student)


}



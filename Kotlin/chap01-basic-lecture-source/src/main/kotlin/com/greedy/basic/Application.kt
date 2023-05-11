package com.greedy.basic

/*
    코틀린 - 가독성 좋은 짧은 코드 작성을 지향한다. (feat. null에 민감)
    코틀린 파일의 특징
    1-1. 자바와 달리 코틀린은 클래스가 반드시 선언 될 필요가 없으며 소스파일명과 클래스명이 달라도 된다.
    1-2. 기본적으로는 package, import, class로 구성되지만 다양한 순서 및 갯수로 구성하고자 하면
         따로 정해진 규칙은 없다.
    1-3. main 메소드에 매개변수(소괄호)를 주지 않아도 잘 동작한다.
 */

fun main(args: Array<String>) {

    /* 콘솔에 출력하기 위해서는 print()나 println()을 사용한다. */
    /* 세미콜론은 적어도 에러는 안나지만, kotlin에서는 사용하지 않는 것이 일반적이고 한 문장에 여러 문장 작성시 주로 사용한다. */
    println("Hello, Kotlin!!");
    print("코틀린 시작!")
    println()

    print("천리길도")
    print("한걸음부터"); print("~!!!~")
    println()
    println()

    print("수료일까지 남은 일수 : ")
    var completion = readLine()     // readLine()을 통해 콘솔로부터 입력을 받는다.
    println("D- " + completion)
}

/* 주석 */
// 한 줄 주석
/*
    여러줄 주석
 */

/*
    여러 줄 주석을 중첩해서 사용 가능
    /*
        중첩 주석 1
        /*
            중첩 주석2
         */
     */
 */
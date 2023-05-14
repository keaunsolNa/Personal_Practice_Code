package com.keaunsol.classes

/* 보조 생성자(자바에서의 생성자 같은 개념) */
/*
   this()의 의미는 주 생성자 또는 다른 보조 생성자를 호출하는 의미를 지니게 된다.
   어떤 보조 생성자이든 반드시 주 생성자를 호출해야 한다.
 */
class MyClass(name: String) {       // 주 생성자
    var name: String = name

    constructor(arg: Int): this("홍길동") {        // 보조 생성자
        println("매개변수 1개 있는 보조 생성자만 호출: $arg") 
        // 주 생성자 매개변수 name으로 보조 생성자 생성
    }

    constructor(arg1: Int, arg2: Int): this(arg1) {     // 보조 생성자
        println("매개변수 2개 있는 보조 생성자 호출: $arg1, $arg2")
        // 주생성자 매개변수 name, 보조 생성자1의 매개변수 name으로 보조 생성자 생성
    }
}

fun main(args: Array<String>) {
//    var my1 = MyClass()
//    var my2 = MyClass(123)
    var my3 = MyClass(111, 222)     // 주 생성자 호출
}

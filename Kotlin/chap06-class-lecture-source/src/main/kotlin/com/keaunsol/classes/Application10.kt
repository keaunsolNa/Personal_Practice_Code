package com.keaunsol.classes

/* Component Object(동반자 객체) */

/*
    object는 class와 달리 인스턴스가 하나만 있는 싱글통 선언 방법이다.
    동반자 객체는 클래스나 인터페이스가 하나만 지닌 객체이고
    자바의 public static 개념에 하나의 인스턴스로 존재(singleton)하는 것이다.
 */

/*
    1. Companion Object는 어떤 클래스의 모든 인스턴스가 공유하는 객체를 만들 때 사용하며
       클래스 당 한 개만 선언할 수 있다. (이름을 지어줄 수도 있다.)
 */
    class CompClass1{
    companion object TestComp {         // public static singleton
        val prop = "CompClass1에 작성 된 TestComp Companion Object의 prop 속성"
        fun method() = "CompClass1에 작성 된 TestComp Companion Object의 method"
    }
}

/* 2. Compnion Object는 이름이 생략될 수 있으며 Companion이라는 식별자를 통해 접근 가능하다. */
class CompClass2{
    companion object  {         // public static singleton
        val prop = "CompClass1에 작성 된 이름 없는 Companion Object의 prop 속성"
        fun method() = "CompClass1에 작성 된 이름 없는 Companion Object의 method"
    }
}

/* 인터페이스 내에서도 Companion Object를 정의할 수 있다. */
interface CompInterface{
    companion object  {         // public static singleton
        val prop = "CompInterface 작성 된 이름 없는 Companion Object의 prop 속성"
        fun method() = "CompInterface 작성 된 이름 없는 Companion Object의 method"
    }
}


val x1 = CompClass1.TestComp
var x2 = CompClass2.Companion       // 동반자 객체의 이름이 없는 경우 Companion으로 호출 가능
val x3 = CompInterface.Companion

fun main(args: Array<String>) {
    println(x1.prop)
    println(x1.method())

    println(x2.prop)
    println(x2.method())

    /* 클래스 안에 정의 된 companion object는 companion object를 지닌 클래스의 이름 만으로도 참조 접근이 가능하다. */
    println(CompClass1.prop)
    println(CompClass2.method())

    println(x3.prop)
    println(x3.method())
}

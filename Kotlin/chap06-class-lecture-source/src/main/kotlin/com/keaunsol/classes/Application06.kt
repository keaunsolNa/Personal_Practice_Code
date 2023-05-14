package com.keaunsol.classes

/* 접근 제어자2 */
class ChildClass(prop1: String, prop2: String) : PublicClass(prop1, prop2) {
    fun parentAccess() {
        println(protectedProp)      // protected 필드는 자식 클래스에서 접근 가능하다.
//        println(privateProp1)
        protectedFunc()             // protected 메소드도 자식 클래스에서 접근 가능하다.
//        privateFunc()
    }
}

fun main(args: Array<String>) {
    var pClass = PublicClass("Hi", "Everyone")
//    pClass.protectedFunc()          // 자식 클래스가 아닌 곳에서는 protected 속성 및 메소드에 접근 불가능하다.
//    pClass.protectedProp

    publicFunc()
//    privateFunc()               // 같은 파일 아니므로 에러
    println(publicVariable)
//    println(privateConstant)    // 같은 파일 아니므로 에러
}

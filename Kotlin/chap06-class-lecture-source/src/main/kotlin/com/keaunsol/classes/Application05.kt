package com.keaunsol.classes

/* 접근 제어자1 */
/*
    private => 해당 파일 또는 클래스에서만 사용 가능
    protected => 상속받은 자식 클래스 및 인터페이스에서만 사용 가능
    internal => 같은 모듈이면 어디서든 사용 가능(같은 프로그램에서만 어디서든 사용 가능)
    public => 어디서든 사용가능
 */
open class PublicClass(var publicProp1: String, private var privateProp1: String) {   // open 키워드를 써서 부모 클래스임을 명시

    var publicProp2 = "public Prop2"
    private var privateProp2 = "private Prop2"

    protected var protectedProp = "protected"

    fun publicFunc() {          // 자신의 클래스에서 정의한 속성들은 접근제어자와 상관없이 접근 가능함
        println(publicProp1)
        println(privateProp1)
        println(protectedProp)
    }

    private fun privateFunc() = println("private 메소드")

    protected fun protectedFunc() = println("자식 클래스")
}

private class PrivateClass() {

}

fun main(args: Array<String>) {
    val publicClass = PublicClass("Hello", "Kotlin")
    publicClass.publicFunc()
//    publicClass.privateProp2          // private에 의해 접근 불가
//    publicClass.privateFunc()         // private에 의해 접근 불가

    val privateClass = PrivateClass()   // 클래스에 붙은 private는 같은 파일 안에서 접근 가능

    publicClass.publicFunc()

}

/* 함수를 정의하며 접근 제어자 설정 */
fun publicFunc() = println("public function")

/* private 접근 제어자를 붙인 함수는 같은 파일 내부에서만 사용이 가능하다. */
private fun privateFunc() = println("private function")

/* 변수를 정의하며 접근 제어자 설정 */
var publicVariable = "public variable"

/* private 접근 제어자를 붙인 변수는 같은 파일 내부에서만 사용이 가능하다. */
private val privateConstant = "private constant"


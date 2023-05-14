package com.keaunsol.function

/*
    로컬 함수
    복잡한 작업을 수행하는 함수의 기능을 내부적으로 분할한 후 구현할 때 사용할 수 있다.
    함수 내부에 있으므로 외부에서는 사용할 수 없다.
 */
fun main(args: Array<String>) {
    var result = outerFunc("to")
//    var result2 = localFunc("to")   // outerFunc이 아닌 mian 함수(외부의 다른 함수)에서는 호출 불가
    println(result)
}

fun outerFunc(target: String): String {
    fun localFunc(str: String): String {
        return "Hello from local $str"
    }
    return localFunc(target) + " outer"
}

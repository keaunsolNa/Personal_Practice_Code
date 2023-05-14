package com.keaunsol.function

/*
    명명인자(Named Argument)
    코틀린에서는 인자값의 개수가 많다면 일일이 전달해야 할 인자값의 순서와 타입을
    기억하는 불편함을 해소하기 위해서 매개변수의 이름과 인자값을 동시에
    전달하는 형태로 함수를 호출할 수 있다.
 */
fun main(args: Array<String>) {

    callTo("이순신", "유관순", 2)
    callTo(times = 2, from = "이순신", to = "유관순")
    callTo("이순신", times = 2, to = "유관순")
}

fun callTo(from: String, to: String, times: Int){
    println("${from}씨가 ${to}를 ${times}번 눌렀습니다.")
}
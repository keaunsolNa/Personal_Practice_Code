package com.keaunsol.control

/* if-else 1 */
fun main(args: Array<String>) {

    if(true) {
        println("true")
    }

    if(100 > 1) {
        println("100은 1보다 크다")
    }

    var a = 100
    if(a >= 100) {
        println("a는 100보다 크거나 같다.")
    }

    var age = 20
    var gender = "남성"
    if(age >= 20 && gender == "남성"){
        println("성인 남성입니다.")
    }

    var num = 10
    if(num % 2 == 0) {
        println("짝수입니다.")
    } else {
        println("홀수입니다.")
    }

    /* until ~까지(미만)를 의미한다. */
    var score = 70

    var grade: String? = null
    if(score == 100 || score in 90 until 100) {
        grade = "A"
    } else if(score in 80 until 90) {
        grade = "B"
    }

    println("grade: ${grade ?: "F"}")


}
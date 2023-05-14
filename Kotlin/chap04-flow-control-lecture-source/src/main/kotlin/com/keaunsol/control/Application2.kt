package com.keaunsol.control

/* if-else 2 */
fun main(args: Array<String>) {

    /* 조건문을 표현식으로 활용할 수 있다. */
    var num1 = 10
    var num2 = 20

    var bigger = if(num1 >= num2) num1 else num2

    println(bigger)

    var score = 75

    var grade = if(score == 100 || score in 90 until 100) {
        println("Perfect")
        "A"
    } else if(score in 80 until 90) {
        println("Excellent")
        "B"
    } else if(score in 70 until 80) {
        println("Good")
        "ABCD".get(2)         // get은 java에서의 charAt과 같다.
    } else {
        println("Average")
        "D"
    }

    println("grade: $grade")

}
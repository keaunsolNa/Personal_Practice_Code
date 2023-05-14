package com.keaunsol.control
/* in과 범위 객체 또는 until을 활용한 for문 */
fun main(args: Array<String>) {

    /* 범위객체(1부터 10까지) */
    var range = 1..10
    println("range: $range")
    println("range.first: ${range.first}")
    println("range.last: ${range.last}")

    /* 1부터 10까지 for문을 통한 출력 */
    for(i in 1..10){
        println(i)
    }

    /* until을 쓸 경우 */
    var oneToNine = 1 until 10
    println("oneToNine: $oneToNine")
    println("oneToNine.first: ${oneToNine.first}")
    println("oneToNine.start: ${oneToNine.start}")
    println("oneToNine.last: ${oneToNine.last}")

    for(i in oneToNine) {
        println(i)
    }

    /* 배열 반복하기 */
    var arr = arrayOf(1, 2, 3)
    for(i in 0..(arr.size - 1)) {   // 코틀린에서는 배열의 크기가 size이다.
        println("..연산자: " + arr[i])
    }

    for(i in 0 until arr.size) {   // 코틀린에서는 배열의 크기가 size이다.
        println("until 연산자: " + arr[i])
    }

    /* 10부터 1까지 역순으로 범위 객체 생성(downTo) */
//    var tenToOne = 10 downTo 1
    var tenToOne = (1..10).reversed()
    for(i in tenToOne) {
        println(i)
    }

    var oneToTenStepTwo = 1..10 step 2
    for(i in oneToTenStepTwo) {
        println(i)
    }

    /* 10부터 2씩 감소하되 1보다 큰 범위 객체 생성 */
//    var tenToOneStepTwo = 10 downTo 1 step 2
    var tenToOneStepTwo = 10.downTo(1).step(2)
    for(i in tenToOneStepTwo) {
        println(i)
    }

    /* 문자 범위를 생성하는 것도 가능 */
    var aToZ = 'a'..'z'
    for(c in aToZ) {
        print(c + " ")
    }
    println()

    var gaToNa = '가' until '나'
    for(c in gaToNa) {
        print(c + " ")
    }
}



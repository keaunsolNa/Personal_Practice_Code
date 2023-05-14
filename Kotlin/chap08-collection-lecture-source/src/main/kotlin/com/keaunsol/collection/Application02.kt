package com.keaunsol.collection

fun main(args: Array<String>) {

    /* Set */
    /* mutableSetOf: 변경 가능한 집합(mutableSet)을 생성하는 함수 */
    var mutableSet = mutableSetOf("축구", "농구", "수영")
    println("mutableSet default init: $mutableSet")

    /* 값 추가 */
    mutableSet.add("야구")
    println("mutableSet add element: $mutableSet")

    /* 중복된 값은 추가되지 않음 */
    mutableSet.add("축구")
    mutableSet.add("농구")
    println("mutableSet add duplicated element: $mutableSet")

    mutableSet.remove("축구")
    println("mutableSet remove element: $mutableSet")

    /* for in 문을 활용한 Set 반복 */
    for(element in mutableSet) {
        print("$element ")
    }
    println()

    var immutableSet = setOf("라면", "국밥", "갈비탕")
//    immutableSet.add("부대찌개")      // 에러남

    /* set은 get메소드나 인덱스 접근 연산자 사용 불가 */
//    mutableSet.get(0)
//    mutableSet[0]
//    mutableSet.get("국밥")
//    mutableSet["라면"]


}
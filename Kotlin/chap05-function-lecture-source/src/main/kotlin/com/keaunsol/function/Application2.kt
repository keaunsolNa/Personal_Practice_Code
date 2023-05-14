package com.keaunsol.function

/* 함수의 인자 */
fun main(args: Array<String>) {
    
    println(sumWithDefault())                   // 초기 세팅된 변수값으로 진행
    println(sumWithDefault(11))              // a 매개변수만 수정
    println(sumWithDefault(40, 60))       // a와 b 둘 다 수정
    println(sumWithDefault(b = 30))             // b 매개변수만 수정

    println(sumWithDefault2(11))              // a 매개변수는 요구한다.
    println(sumWithDefault2(40, 60))


   println(sumWithVargs(10, 20, 30, 40, 50, 60))
    println(sumWithVargsWithBase(100,10,20,30,40,50,))

}

/* 모든 인자값에 기본값이 적용된 함수 */
fun sumWithDefault(a: Int = 10, b: Int = 20): Int {
    return a + b
}

/* 일부 인자값에 기본값이 적용된 함수 */
fun sumWithDefault2(a: Int, b: Int = 20): Int {
    return a + b
}

/* vararg: 가변인자 */
fun sumWithVargs(vararg nums: Int): Int {
    var total = 0
    for(num in nums) {
        total += num
    }
    return total
}

/* 일반 인자와 가변인자가 섞여 있는 경우(가변인자는 항상 가장 마지막에 선언해야 한다.) */
fun sumWithVargsWithBase(base: Int, vararg nums: Int): Int {
    var total = base
    for(num in nums){
        total += num
    }
    return total
}
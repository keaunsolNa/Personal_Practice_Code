package com.keaunsol.control

/* 중첩 반복문(nested for) */
fun main(args: Array<String>) {
    println("구구단 출력")

    for(i in 2 .. 9){
        for(j in 1 .. 9){
            println("$i x $j = ${i * j}")
        }
    }

    /*
        *
        * *
        * * *
        * * * *
        * * * * *
     */
    println("별찍기 출력")
    val row = 5
    for(i in 1 .. row){
        for(j in 1 .. i){
            print("* ")
        }
        println()
    }
}

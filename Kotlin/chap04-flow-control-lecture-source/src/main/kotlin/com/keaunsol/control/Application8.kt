package com.keaunsol.control

/* break와 continue */
fun main(args: Array<String>) {
    var sum = 0
    var i = 0
    while(true) {
        sum += i
        i++
        if(i > 10) {
            println("break 명령어 실행")
            break
        }
    }
    println(sum)

    for(i in 1 .. 10) {
        println(i)
        break
        println("after break")
    }

    /* break */
    while(true) {
        print("'b'를 입력하여 break 명령어를 실행 : ")
        var input = readLine()?.trim()
        if(input != "") {
            if(input == "b") {
                println("break 명령어를 이용하여 반복문을 탈출합니다.")
                break
            } else {
                println("${input}을 입력하셨습니다.")
            }
        } else {
            println("입력값 없음")
        }
    }

    /* continue 명령어 사용 코드 */
    println("짝수단만 출력")
    for(i in 2 .. 9) {
        if(i % 2 != 0) continue
        for(j in 1 .. 9) {
            println("$i x $j = ${i * j}")
        }
    }
}

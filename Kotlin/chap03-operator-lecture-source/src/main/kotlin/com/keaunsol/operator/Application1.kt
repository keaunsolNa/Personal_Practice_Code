package com.keaunsol.operator

fun main(args: Array<String>) {

    /* 산술 연산자(mathmetical operator) */
    var sum = 5 + 8
    var sub = 4 - 6
    var mul = 3 * 5

    println("sum: $sum")
    println("sub: $sub")
    println("mul: $mul")

    var div = 6 / 5
    var divDouble1 = 6.0 / 5.0
    var divDouble2 = 6 / 5.toDouble()

    println("div: $div")
    println("divDouble1: $divDouble1")
    println("divDouble2: $divDouble2")

    var mod1 = 6 % 5
    var mod2 = 3 % 3

    println("mod1: $mod1, mod2: $mod2")

    var complex = ((5 + 3) * (4 / 2)) % 3
    println("complex: $complex")

    var intValue1: Int = 2147483647
    println("before overflow: $intValue1")

    intValue1 = intValue1 + 1
    println("after overflow: $intValue1")

    intValue1 = intValue1 - 1
    println("after underflow: $intValue1")

    /* 복합 대입 연산자(augmented assignment operator) */
    var w1 = 10

    /* w1 = w1 + 20 대입문과 같은 결과 */
    w1 += 20
    println("w1 += 20: $w1")

    /* w1 = w1 - 10 대입문과 같은 결과 */
    w1 -= 10
    println("w1 -= 10: $w1")

    /* w1 = w1 * 2 대입문과 같은 결과 */
    w1 *= 2
    println("w1 *= 2: $w1")

    /* w1 = w1 / 2 대입문과 같은 결과 */
    w1 /= 2
    println("w1 /= 2: $w1")

    /* w1 = w1 % 3 대입문과 같은 결과 */
    w1 %= 3
    println("w1 %= 3: $w1")

    /* 증감연산자 */
    var value = 100

    /* 값을 1증가(value += 1과 같은 결과) */
    value++

    /* 값을 1증가시켰으므로 101을 출력 */
    println("after value++: " + value)

    /* 값을 1감소(value -= 1과 같은 결과) */
    value--

    /* 값을 1갑소시켰으므로 100을 출력 */
    println("after value--: " + value)

    /* -연산자를 이용한 부호 변경 */
    println("-value: " + (-value))

    /* -연산자를 두 번 적용해 값의 부호를 원래대로 변경 */
    println("-(-value)): " + (-(-value)))

}
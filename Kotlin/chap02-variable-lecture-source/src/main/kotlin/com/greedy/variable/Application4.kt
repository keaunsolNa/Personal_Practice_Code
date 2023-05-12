package com.greedy.variable

/*
    타입 변환
    toByte(): Byte 타입으로 변환
    toShort(): Short 타입으로 변환
    toInt(): Int 타입으로 변환
    toLong(): Long 타입으로 변환
    toFloat(): Float 타입으로 변환
    toSDouble(): Double 타입으로 변환
    toChar(): Char 타입으로 변환

    코틀린에서는 자바에서와 달리 자동현변환이 적용되지 않으므로 항상 명시적 형변환을 해 줘야 한다.
 */

fun main(args: Array<String>) {

    /* 타입을 변환할 변수 선언 */
    var byteValue: Byte = 65
    println(byteValue)

    /* Int, SHort, Long, Float, Double 타입으로 각각 변환하는 메소드를 호출 */
    var intValue: Int = byteValue.toInt()
    println(intValue)

    var shortValue: Short = byteValue.toShort()
    println(shortValue)

    var longValue: Long = byteValue.toLong()
    println(longValue)

    var floatValue: Float = byteValue.toFloat()
    println(floatValue)

    var doubleValue: Double = byteValue.toDouble()
    println(doubleValue)

    /* Char 타입으로 변환. 65는 유니코드 번호로 문자 'A'에 대응되므로 charValue 변수에는 'A'문자 저장 */
    var charValue: Char = byteValue.toChar()
    println(charValue)

    /* 문자열을 기본 타입으로 변환 */
    var intString: String = "1234"
    var doubleString: String = "1.234"

    var stringToInt: Int = intString.toInt()
    var stringToDouble: Double = doubleString.toDouble()

    println(stringToInt)
    println(stringToDouble)

    var booleanString: String = "true"
    var stringToBoolean: Boolean = booleanString.toBoolean()
    println(stringToBoolean)

    /* 기본 타입을 문자열로 변환 */
    var num: Int = 123
    var intToString: String = num.toString()
    println(intToString)

}


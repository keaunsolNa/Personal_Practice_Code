package com.greedy.variable

/*
    Nullable 타입
    자바의 경우 null이 대입되는 참조자료형이나 Wrapper 클래스 같은 경우에는 null값 여부를
    확인하는 과정을 생략, 혹은 변수에 null값이 대입됐을 수도 있다는 상황을 가정하지 않고 코드를
    작성해서 NullPointerException이 발생하는 상황이 많다.
    코틀린은 변수의 타입을 기본적으로 null값 대입이 허용되지 않는 타입으로 선언하게 되어 있고
    그 외에 여러 연산자를 통해 NPE를 방지하고 있다.
 */
fun main(args: Array<String>) {

    /* 기본적으로 null값 대입을 허용하지 않는 타입(Int)으로 선언 */
    var num = 100

    /* null 값 대입 불가 */
//    num = null

    /* null을 대입받을 수 있는 Int? 타입의 변수를 선언 */
    var a: Int? = 100
    a = null
    println(a)

    var s: String = "Hello"
//    s = null

    println(s.length)       // NPE(NullPointerException) 걱정 없이 안전하게 접근 가능

    /* 자바에서 볼 수 없었던 연산자 5가지 */
    var c: String? = null
    if(c != null) {
        println("if를 통한 null이 아닌 값 확인 : $c")
    }


    /* 1. let 함수를 이용한 null 타입값 접근 */
    /*
        let 함수는 범위함수로써 변수의 값이 null이 아닌 경우에 실행 할 코드 블록을 작성할 수 있게 도와주는 함수
        it: value-parameter인 c가 null이 아닌 경우 c를 의미한다.
     */
    c?.let {
        println("let을 통한 null이 아닌 값 확인: " + it)     // it => c
    }

    /* 2. 안전호출연산자(Safe-call Operator)를 이용하는 방법 */
    /* ?와 .을 붙여 null일 경우 우측에 접근하지 않고 곧바로 null값을 반환한다. */
    var len: Int? = c?.length       // c가 null일 때 프로퍼티, 메소드 접근을 무시 (NPE 방지)

    println("안전호출 연산자를 통한 문자열 길이 확인: $len")

    /* 3. 엘비스(Elvis)연산자를 이용하는 방법 */
    /*
        연산자 왼쪽의 피연산자가 null이 아닐 경우 해당 값을 반환하고 null일 경우 오른쪽 피연산자를
        반환한다.
     */
    var one = null ?: 1         // 왼쪽 피연산자의 값이 null이므로 오른쪽 피연산자값(1)을 반환
    println(one)

    var two = 2 ?: 1         // 왼쪽 피연산자의 값이 null이 아니므로 왼쪽 피연산자값(2)을 반환
    println(two)

    /* 4. null값이 아님을 보증하는 연산자를 사용해 null을 허용하지 않는 타입으로 변환 */
    /*
        !! 연산자를 이용하여 타입을 null이 불가능한 타입이라고 명명할 수는 있지만, 컴파일 에러를
        런타입 Exception으로 바꾼 것 뿐, NPE는 그대로 발생한다.
        즉, 가독성을 위한 연산자
     */

//    var nullableStr: String? = null
//    var str: String = nullableStr!!
//    println(str.length)

    /* 5. null을 반환하는 타입 변환 메소드 */
    var wrongNumberString = "숫자아님"
//    var wrong = wrongNumberString.toInt()

    var wrong: Int? = wrongNumberString.toIntOrNull()
    println(wrong)

}

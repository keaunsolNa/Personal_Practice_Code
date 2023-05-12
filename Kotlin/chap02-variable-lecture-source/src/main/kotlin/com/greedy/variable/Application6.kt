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

    var num = 100
}

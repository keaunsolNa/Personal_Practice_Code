package com.keaunsol.classes

/* 자동차 클래스 정의 */
/*
    클래스 내부에 정의한 변수 혹은 상수를 속성(property)라고 하며
    함수는 메소드(method)라고 한다.
 */
class Car {

    /* 속성 정의 */
    var speed: Int = 0                  // 현재 속도
    var isOn: Boolean = true            // 차량 시동 여부

    /* 메소드 정의 */
    fun accelerate() {                  // 가속
        speed += 10
    }

    fun decelerate() {                  // 감속
        speed -= 10
        if(speed < 0) speed = 0
    }

    fun turnOn() {                      // 시동 On
        isOn = true
    }

    fun turnOff() {                     // 시동 Off
        isOn = false
        speed = 0;
    }

    fun speedToString(): String {       // 현재 속도값 반환
        return "current speed: $speed"
    }
}

fun main(args: Array<String>) {

    var c = Car()                       // Car 객체 생성(기본생성자를 활용)

    /* 시동을 켠다. */
    c.turnOn()

    /* 시동 여부 및 속도 확인 */
    println(c.isOn)
    println(c.speed)

    /* 가속을 한다. */
    c.accelerate()
    c.accelerate()

    /* 가속 후 현재 속도 확인 */
    println(c.speedToString())

    /* 감속을 한다. */
    c.decelerate()

    /* 감속 후 현재 속도 확인 */
    println(c.speedToString())

    /* 시동을 끈다. */
    c.turnOff()

    /* 시동 여부 및 속도 확인 */
    println(c.isOn)
    println(c.speed)
}
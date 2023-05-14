package com.keaunsol.inheritance
/* 상속 */
open class Animal(var name: String, var age: Int, val gender: String) {
    fun eat(food: String) {
        println("${name}이(가) ${food}를(을) 먹습니다.")
    }

    open fun sleep(hour: Int) {
        println("${name}이(가) ${hour}시간 동안 잡니다.")
    }
}

class Rabbit(name: String, age: Int, gender: String, var location: String, var weight: Int, var kinds: String) : Animal(name, age, gender) {
    fun jump(hour: Int) {
        println("${location}에 살고 있는 몸무게가 ${weight}kg인 ${kinds}종 토끼 ${name}이(가) 깡총깡총 뜁니다.")
    }

    override fun sleep(hour: Int) {
        println("sleep을 오버라이딩 함")
    }
}

/* 다형성 */
open class Parent(var parentProp: Int) {
    fun parentFunc() {
        println("parentFunc")
    }
}

class Child(prop: Int, var childProp: Int) : Parent(prop) {
    fun childFunc() {
        println("${super.parentProp}")
        super.parentFunc()
        println("childFunc")
    }
}

fun main(args: Array<String>) {
    var rabbit1 = Rabbit("엽기토끼", 25, "암컷", "강남", 100, "라이언헤드")
    var rabbit2 = Rabbit("비실토끼", 21, "수컷", "강원도", 5, "산토끼")

    rabbit1.eat("햄버거")
    rabbit2.jump(8)

    rabbit2.sleep(2)

    println("=====================")
    var p = Parent(1)
    println("${p.parentProp}")
    var c = Child(1, 2)
    println("${c.parentProp}, ${c.childProp}")

    println("====================")
    var poly: Parent = Child(3, 4)
    poly.parentFunc()           // Parent타입으로 인지된 공간

    println("===================")
//    poly as Child               // 코틀린에서 형변환은 as 키워드를 사용한다.
//    poly.childFunc()

    if(poly is Child) {         // is는 java의 instanceof와 같은 연산자이다.(+ 다운 캐스팅도 해줌)
        poly.childFunc()
        println("${poly.parentProp}, ${poly.childProp}")
    }

}



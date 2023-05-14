package com.keaunsol.classes

/*
    초기화를 하는 시점을 실제 사용할 때 하는 것이 합리적이라는 생각으로 나온 개념들
    lazy 키워드
    - 변수를 선언할 때 초기화 코드도 함께 정의하고 변수가 사용될 때 (최초)
      초기화 코드가 단 한번 동작하여 변수를 초기화 한다.

    lateinit 키워드(나중에 값이 들어올꺼니까 걱정하지 말라고 하는 것과 비슷하다.)
    - 필요한 시점에 해당 필드를 초기화 해서 사용할 수 있다.
      객체를 만드는데는 문제없이 보장한다고는 하지만 초기화하지 않고 해당 필드를
      활용할 때 Exception이 발생할 수 있으므로 주의를 요함(초기화를 잊으면 안 된다.)
 */

class LazyClass(var x: Int) {

    val lazyValue1 by lazy {
        println("lzt 람다 식 내부에서 속성 값 초기화 진행")
        var s = " HELLO "
        s.toLowerCase().trim()      // 이 값이 return 되어 필드에 대입 된다.
    }

    val lazyValue2 by lazy {
        x * 2
    }

    val costHeavyProperty by lazy {
        println("시간이 오래 걸리고 메모리 사용량이 많은 속성값 초기화 진행")
        Thread.sleep(2000)                      // 2초 시간 지연
        Array<Byte>(1024 * 1024 * 100) {0}  // 100MByte의 배열 선언
    }
}

class LateInitClass {
    lateinit var obj: PropertyObject                // 변수의 초기화를 뒤로 미루고, 선언만 시행한다.

    /*
        1. 처음에 아무값도 대입하지 않고 쓰기 위한 키워드
        2. val은 사용이 불가능하다.  (해당 필드의 setter를 써서 값을 넣어줘야 하기 때문에)
        3. lateinnit 프로퍼티는 오직 클래스 타입(레퍼런스 타입)만 지원한다. (기본자료형 or String은 안됨)

     */
    fun initMyObject(value : PropertyObject) {
        obj = value
    }

    fun userMyobject() {
        obj.func()
    }
}

class PropertyObject {
    fun func() {
        println("from PropertyObject Function")
    }
}


fun main(args: Array<String>) {
    var lazyClass = LazyClass(10)

    println(lazyClass.lazyValue1)                   // 최초 1번만 실행
    println(lazyClass.lazyValue1)
    println(lazyClass.lazyValue1)

    // 비용이 많이 드는 작업은 접근 시 람다식 내부가 동작하는 것이 합리적이다.
    println(lazyClass.costHeavyProperty)

    var lateInitClass = LateInitClass()
    lateInitClass.initMyObject(PropertyObject())    // 필드 초기화
    lateInitClass.userMyobject()                    // 초기화 이후 필드를 활용한 기능 호출


}
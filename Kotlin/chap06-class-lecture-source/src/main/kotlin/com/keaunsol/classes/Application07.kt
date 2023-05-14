package com.keaunsol.classes

/*
    setter와 getter
    : 코틀린은 프로퍼티를 선언하면 setter/getter가 자동으로 선언되고 재정의 할 수도 있다.

    1. val과 var로 getter만 생성할 지 둘 다 생성할 지 정할 수 있다.
    2. var이지만 setter를 private로 만들어 외부에서 변경할 수 없도록 할 수 있다.
    3. 프로퍼티에 get()과 set()함수를 정의함으로써 자동으로 생성된 getter/setter를 재정의할 수 있음
*/

class GetterAndSetterClass() {
    var num: Int = 0

        /* setter는 속성 값을 설정하기 위해 값의 대입이 이뤄지는 시점에 자동 호출 됨 */
        private set(value) {            // 외부에서의 값의 오염을 방지하고자 setter에는 private 적용이 가능하다.
            println("값을 ${value}로 설정")
            field = value               // field는 백킹 필드(내부적으로 setter가 동작할 때 재귀호출을 막기 위함 )
        }

        /* getter는 해당 속성 값을 읽어오는 시점에 호출 됨 */
        get() {                         // getter는 private 적용이 안 된다.
            println("${field}값을 반환")
            return field
        }
}

/*
    val인 필드는 getter만 만들어지고
    var인 필드는 setter도 만들어진다.
 */
class Person6(val name: String, pAge: Int) {
    var age: Int = 0
        set(value) {
            /* setter에서 when을 활용한 조건식 사용 가능, 이후 field에 반영 */
            when {
                value < 0 -> throw Exception("음수 나이는 허용되지 않습니다.")
                value > 200 -> throw Exception("나이가 너무 많습니다.")
            }
            field = value
        }

    var isMinor = pAge < 21
        get() = this.age < 20

    /* init 블록을 이용해서 속성값 초기화 */
    /*
        init 블록은 주 생성자를 통한 초기화 작업(대입작업)이 끝난 직후에 실행된다.
        속성값을 초기화 할 때 필요한 코드가 있다면 init블록을 사용하게 된다.
     */
    init {
        age = pAge - 1
    }

}
fun main(args: Array<String>) {

//    var gas = GetterAndSetterClass()
//    gas.num = 100                       // num의 setter를 자동 호출
//    println(gas.num)                    // num의 getter를 자동 호출

    var p6 = Person6("김창수", 33);
    println(p6.name +", " + p6.age +", " +p6.isMinor)

    p6 = Person6("김영희", 18)
    println(p6.name +", " + p6.age +", " +p6.isMinor)

//    p6.age = -1                           // Exception
//    p6.age = 300                          // Exception

}
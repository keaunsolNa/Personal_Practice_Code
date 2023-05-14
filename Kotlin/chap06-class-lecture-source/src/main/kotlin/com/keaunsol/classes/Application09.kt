package com.keaunsol.classes

/* 데이터 클래스 */

/*
    단순히 값을 저장하기 위한 용도로 클래스를 활용하려면 data 키워드를 이용해서
    클래스를 데이터 클래스로 정의할 수 있다.
    데이터 클래스로 정의하면 유용하게 활용할 수 있는 여러 메소드를 자동으로 구현해 준다.
    (단! 주생성자에 정의된 속성만 이용해서 메소드의 내용을 구성한다.)

    (
        toString 메소드: 객체의 내용을 문자열로 반환
                        클래스 이름(속성1 = 속성값1, 속성2 = 속성값2, ..., 속성n = 속성값n),
        equals 메소드: 두 객체가 지닌 속성값(내용)이 같은지 비교(논리적으로 비교)하고 그 결과를 boolean값으로 반환,
        copy 메소드: 원본 객체에 있는 모든 속성값들이 복사 된 새로운 객체가 생성된다,
        componentN 메소드: 객체의 속성값을 반환하는 메소드, 데이터 클래스에 포함 할 속성의 개수만큼 component 메소드가 생성된다.
        hashCode 메소드: 객체가 논리적으로 같은 값을 가지고 있는지 여부를 좀 더 효율적으로 검사하기 위해 사용되는 메소드
        (컬렉션의 map을 사용할 때는 equals와 hashCode를 오버라이딩 해야 한다.(키 값 동등비교 때문에..)
    )

 */
/* 클래스의 내용({})을 쓰지 않아도 필드 두개 선언 및 getter/setter 부터  toString까지 모두 정의 됨 */
data class PersonClass(var name: String, var age: Int)

fun main(args: Array<String>) {

    var p1 = PersonClass("김정수", 20)
    var p2 = PersonClass("김정수", 20)
    var p3 = PersonClass("김범수", 28)

    /* <toString> */
    var personToString = p1.toString()
    println(personToString)
    println(p2)

    /* <equals> */
    /*
        비교 연산자(==)을 이용하면 내부적으로 equals 메소드가 호출되고 메소드의 인자값으로 비교할 대상
        객체가 전달된다.
        (ex: p1 == p2는 p1.equals(p2)가 된다.)(동등 비교)

        참조 비교 연산자(===)을 이용하면 두 객체의 참조가 같은지(완전 같은 객체인지)를 비교한다.
     */
    println("equals: ${p1.equals(p2)}")
    println(p1 == p2)           // 동등 하므로 true
    println(p1 === p3)          // 동일하지 않으므로 false
    println(p1 == p3)           // 동등하지 않으므로 false

    /* <hashCode> */
    println(p1.hashCode())
    println(p2.hashCode())
    println(p3.hashCode())

    /* <copy> */
    var copied1 = p1.copy()
    println(copied1)            // 사본 확인
    println(copied1 == p1)      // 사본이 동동한 값을 가졌는지 확인
    println(copied1 === p1)     // 깊은 복사인지 얕은 복사인지 확인 (깊은 복사)

    /* <componentN> */
    /*
        component 관련 메소드들은 쓸모없어 보이지만 구조분해 할당(Destructuring Declaration)을 이용할 때
        componentN 메소드가 유용하게 활용된다.
        (구조 분해 할당은 객체의 속성값을 간편하게 여러 개의 변수에 대입하기 위해 사용하는 방법
     */

    /* 구조 분해 할당 방법 1 */
//    var (p1Name, p1Age) = p1
//    println(p1Name)
//    println(p1Age)

    /* 구조 분해 할당 방법 2 */
    var p1Name = p1.component1()
    var p1Age = p1.component2()
    println(p1Name)
    println(p1Age)


}

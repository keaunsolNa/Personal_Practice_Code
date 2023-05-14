package com.keaunsol.classes

/* 생성자에 따른 클래스 정의 방법 */
/* 1. 생성자가 없는 클래스 */
class Person1 {
    var name: String = "홍길동"
    var age: Int = 10
}

/* 2. 주 생성자가 포함된 클래스 */
class Person2(val name: String, var age: Int, val gender: String) {

}

/* 3. 주 생성자를 통해서 값만 전달 받는 클래스 */
class Person3(name: String, age: Int, gender: String) {
    var name: String = name
    var age: Int = age
    var gender: String = gender
}

/* 4. 주 생성자에 기본값이 설정된 클래스 */
class Person4(val gender: String, val name: String = "유관순", var age: Int = 20){

}
fun main(args: Array<String>) {

    var p1 = Person1()
    println("${p1.name}, ${p1.age}")

//    var p2 = Person2("홍길동", 20, "남자")
    var p2 = Person2(age = 20, gender = "남성", name = "홍길동") // 명명인자 사용 가능
    
    p2.age = 30
//    p2.name = "테스트"             // val 변수는 수정 불가(읽기 전용이므로)
    println("${p2.name}, ${p2.age}, ${p2.gender}")

    var p3 = Person3("홍길동", 20, "남자")
    println("${p3.name}, ${p3.age}, ${p3.gender}")

//    var p4 = Person4("여성")
    var p4 = Person4("남성", age= 40, name = "임꺽정")
    println("${p4.name}, ${p4.age}, ${p4.gender}")


}
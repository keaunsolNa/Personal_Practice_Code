package com.keaunsol.collection

/*
    컬렉션(Collection)
    List, Set, Map
    immutable(기본) vs mutable

 */
fun main(args: Array<String>) {

    /* List */
    /* mutableListOf: 변경 가능한 리스트(mutableList)를 선언하는 함수*/

    /*
        처음 선언 시에 비어있는 상태로 생성되는 리스트는 값이 대입되지 않아 타입 정보를
        유추할 수 없으므로 에러가 발생한다.
        리스트에 포함 될 자료의 타입을 명시해야 한다.
     */
    var emptyMutableList: MutableList<String> = mutableListOf()

    /* String들이 담긴 MutableList를 바로 선언 */
    var mutableList = mutableListOf("사과", "바나나", "메론")
    println("mutableList default init : ${mutableList.toString()}")
    println("mutableList default init : $mutableList")

    /* add: 요소 뒤 값 추가 */
    mutableList.add("딸기")
    println("mutableList add element : $mutableList")

    /* 원하는 위치에 요소 추가(인덱스 활용) */
    mutableList.add(2, "수박")
    println("mutableList add index : $mutableList")

    /* remove, removeAt: 동등 요소 삭제 */
    mutableList.remove("메론")
    println("mutableList remove element : $mutableList")

    mutableList.removeAt(1)
    println("mutableList remove index : $mutableList")

    /* get: 값 추출 */
    var value1 = mutableList.get(1)
    println("mutableList.get(1): $value1")

    /* 인덱스 접근 연산자([]): 값 추출 */
    var value2 = mutableList[2]
    println("mutableList access index [2]: $value2")

    /* for-in 문으로 요소 꺼내오기 */
    println("mutableList loop: ")
    for(item in mutableList) {
        print("$item ")
    }
    println()

    /* contains: 요소 포함 여부 */
    println("mutableList contain 딸기: ${mutableList.contains("딸기")}")
    println("mutableList contain 포도: ${mutableList.contains("포도")}")

    /* size: 요소 개수 */
    println("mutableList size: ${mutableList.size}")

    /* listOf: 변경 불가능한 리스트(immutableList)를 선언하는 함수 */
    var immutableList = listOf(1, 2, 3)
//    immutableList.add(4)              // 추가 불가능
//    immutableList.remove(1)           // 제거 불가능
    
    // 읽기는 가능
    println("immutable List index [2]: ${immutableList[2]}")

    /* immutableList -> mutableList로 전환 가능 */
    var immutableToMutableList = immutableList.toMutableList()

    immutableToMutableList.add(4)
    immutableToMutableList.removeAt(3)

    /* + 연산자로 두 리스트를 합칠 수 있다.(동일한 타입만 가능) */
    var plusList: List<Char> = listOf('a', 'b', 'c') + listOf('d', 'e', 'f')
    println("list concat: $plusList")

    /* - 연산자로 앞의 리스트에서 뒤의 리스트의 내용을 삭제한 리스트를 얻을 수 있다.(중복 제거 가능) */
    var substarctList: List<Int> = listOf(1, 2, 3, 1, 3, 4, 5, 2, 6) - listOf(2, 4, 6, 1)
    println("list substract set: $substarctList")

}

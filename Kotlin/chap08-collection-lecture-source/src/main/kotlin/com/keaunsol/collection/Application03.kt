package com.keaunsol.collection

fun main(args: Array<String>) {
    /* Map */
    /*
        Pair 타입은 객체 두 개를 넣을 수 있는 타입으로 자바의 Map에서의 key와 value의 쌍인
        Entry 개념을 표현하는 자료형이다.
     */
    var pair: Pair<String, Int> = "key" to 1

    /* mutableMapOf: 변경 가능한 맵이자 매개변수로 전달받은 Pair들을 이용해 mutableMap을 만들 수 있게 해주는 함수 */
//    var mutableMap = mutableMapOf("key1" to 1, "key2" to 2)
    var mutableMap = mutableMapOf(pair, "key2" to 2)
    println("mutableMap: $mutableMap")

    /* 비어있는 맵 선언(자료형을 적어야 한다.) */
    var emptyMutableMap = mutableMapOf<String, Int>()
    println("empty mutableMap: $emptyMutableMap")

    emptyMutableMap.put("key3", 3)
    println("empty mutableMap put pair: $emptyMutableMap")

    emptyMutableMap.put("key3", 4)          // 기존과 같은 키값을 지닌 pair(쌍)을 덮어 쓴다. (수정)
    println("empty mutableMap put pair with duplicated key: $emptyMutableMap")

    emptyMutableMap.remove("key3")
    println("mutableMap remove pair with key: $emptyMutableMap")

    /* get("키값") 메소드 또는 []를 호출해 값에 접근 가능 */
    var valueFromKey2 = mutableMap.get("key2")
    println("mutablemap get Key2: $valueFromKey2")

    var valueFromkey1 = mutableMap["key"]
    println("mutableMap get key1: $valueFromkey1")

    /* for in 문을 활용한 map 반복 */
    for(pair in mutableMap) {
//        print("$pair ")
        print("${pair.key} = ${pair.value} ")
    }
    println()

    /* immutableMap */
    var immutableMap = mapOf("key1" to 1, "key2" to 2)
//    immutableMap.put("key3", 3)     // 에러 발생

}
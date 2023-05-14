package com.keaunsol.control

/* in을 활용한 다양한 for문(배열, 컬렉션 관련) */
fun main(args: Array<String>) {
    
    /* Array 객체를 사용하여 반복 */
    var arr = arrayOf(1, 2, 3)
    
    for(i in arr) {
        println(i)
    }
    println("배열 순회 완료")
    
    /* list 객체를 순회 */
    var list = listOf(1, 2, 3)
    for(item in list) {
        println(item)
    }
    
    println("리스트 순회 완료")
    
    /* map 객체를 순회 */
    var map = mapOf("a" to 1, "b" to 2, "c" to 3)
    for(pair in map) {
        println("${pair.key} to ${pair.value}")
    }
    
    println("맵 순회 완료")
    
    /* set 객체를 순회 */
    var set = setOf("a", "b", "c")
    for(ele in set) {
        println(ele)
    }
    
    println("집회 순회 완룐")
}

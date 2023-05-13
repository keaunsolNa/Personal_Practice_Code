package com.keaunsol.operator

/* 배열 및 mutableMap 선언하기 */
fun main(args: Array<String>) {

    /* 인덱스 연산자 사용 */
    var nums = arrayOf(100, 101, 102)

    println("nums[0]: ${nums[0]}")
    println("nums[1]: ${nums[1]}")
    println("nums[2]: ${nums[2]}")

    nums[1] = 200
    println(nums[1])

    /* mutableMap 잠시 살펴보기 */
    var areaCodeMap = mutableMapOf("02" to "서울", "055" to "경남")
    println(areaCodeMap["02"])
    println(areaCodeMap["055"])
    /*
        Java의
        Map<String, String> areaMap = new Map<>();
        areaMap.put("02", "서울")
        areaMap.put("055", "경남")
     */

    areaCodeMap["051"] = "부산"
    println(areaCodeMap["051"])

}

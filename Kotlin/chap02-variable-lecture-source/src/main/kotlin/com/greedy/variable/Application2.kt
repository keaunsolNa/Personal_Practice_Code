
/*
    RawString(원시 문자열)과 StringTemplate(문자열 탬플릿)

    일반 문자열은 엔터나 탭 같은 특수기능을 표현하려면 이스케이프 문자('\' 포함한 문자)를 사용해야 하지만
    이와 달리 RawString(""")은 작성한 모습 그대로 활용할 수 있게 해준다.
 */
fun main(args: Array<String>) {

    /* 일반 문자열 사용 */
    var str = "일반 문자열 안에서는 \n\n 문자열 안에 엔터나 스 페 이 스\t 그리고 탭을 자유롭게 사용할 수 " +
            "\n 있으며 이스케이프 문자 사용도 \n가능하다."

    /* RawString 사용 */
    var raw = """원시 문자열 안에서는
문자열 안에 엔터나 스 페 이 스 그리고 탭을 자유롭게 사용할 수 
있으며 이스케이프 문자 사용도
가능하다."""

    println(str)
    println(raw)

    var num1 = 10
    var num2 = 20

    /* 문자열 템플릿: 문자열 안에서 '$'(문자열 탬플릿)을 활용해서 변수의 값을 바로 적용해 볼 수 있다. */
    var startWithNum = "Hello, $num1"
    println(startWithNum)

    /* 문자열 템플릿을 활용할 때 $에 {}를 씌우면 표현식(연산결과나 함수의 결과와 같은 하나의 값을 도출하는 식)을 쓸 수 있다. */
    var sum = "sum : ${num1 + num2}"
    println(sum)

    var str2 = "\n\t Hello \t\n"
    println(str2)

    var trimStr = "trimStr: ${str2.trim()}"
    println(trimStr)


}

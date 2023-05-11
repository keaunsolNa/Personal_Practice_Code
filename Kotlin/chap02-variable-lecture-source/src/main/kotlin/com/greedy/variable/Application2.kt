
/*
    RawString(원시 문자열)과 StringTemplate(문자열 탬플릿)
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
}

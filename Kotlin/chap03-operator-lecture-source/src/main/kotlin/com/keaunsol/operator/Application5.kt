package com.keaunsol.operator

/*
    연산자 우선순위

    (우선순위 높음)
    후위 연산자                          ++, --, ., ?., ?
    전위 연산자                          -, +, ++, --, !, label
    타입 변환 연산자                      :, as, as?
    곱셈, 나눗셈, 나머지 연산자            *, /, %
    덧셈, 뺄셈 연산자                     +, -
    범위 연산자                          ..
    중위 함수                            N/A
    엘비스 연산자                         ?:
    포함 관계 여부 및 타입 확인 연산자       in, !in, is, !is
    대소 비교 연산자                       <, >, <=, >=
    동등 비교 연산자                       ==, !==
    AND 연산자                           &&
    OR 연산자                            ||
    스프레드 연산자                        *
    대입, 복합 대입 연산자                  =, +=, -=, *=, /=, %=
    (우선순위 낮음)
 */
fun main(args: Array<String>) {

    println(true || 2 < 1)

    var result = 10 * 5 in 1..100 || true && false
    println(result)
}


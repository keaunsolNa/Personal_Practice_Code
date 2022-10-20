/* 02.recursive-function(재귀 함수) */
/* 함수가 자기 자신을 호출하는 것을 재귀호출이라고 한다. */

function factorial(n){
    if(n <= 1) return 1;
    return n * factorial(n -  1);
}

console.log(factorial(20));

/*
    재귀 함수는 반복 처리를 반복문 없이 구현할 수 있다는 장점이 있지만
    무한 반복에 빠질 위험이 있고 이로 인해 스택 오버플로 에러를 발생시킬 수 있으므로 주의한다.
    한정적으로 사용하는 것이 바람직하다. 
*/
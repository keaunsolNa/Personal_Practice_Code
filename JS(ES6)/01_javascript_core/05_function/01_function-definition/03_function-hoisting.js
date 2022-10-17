/* function-hoisting (함수 호이스팅)*/

console.log(hello('홍길동'));
console.log(hi);

/* 함수 선언문(먼저 해석함) */
/* 함수 선언문은 반드시 함수의 이름을 명시해야 한다. */
function hello(name){
    return `${name}님 안녕하세요!`;
};

/* 함수 표현식 */
var hi = function(name){
    return `${name} 안녕~`;
};

/*
    함수 선언문은 런타임 이전 자바스크립트 엔진에 의해 먼저 실행된다.
    따라서 함수 선언문 이전에 함수를 참조할 수 있으며 호출할 수도 있다.
    함수 선언문이 코드의 선두로 끌어 올려진 것처럼 동작하는 
    자바스크립트 고유의 특징을 호이스팅이라고 한다.
*/

console.log(hello);
console.log(hi);

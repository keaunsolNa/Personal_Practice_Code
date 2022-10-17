/* 01. function-declaration(함수 선언문) */
function hello(name){
    return `${name}님 안녕하세요!`;
}

console.log(hello('홍길동'));

/*
    자바스크립트 엔진은 생성된 함수를 호출하기 위해 함수 이름과 동일한 식별자를 암묵적으로 생성하고,
    거기에 함수 객체를 할당한다.
    즉, 함수는 함수 이름으로 호출하는 것이 아니라 함수 객체를 가리키는 식별자로 호출한다.
*/
/* 암묵적으로 생성되는 코드 */
// var hello = function hello(name){
//     return `${name}님 안녕하세요!`;
// };

/* 식별자로 호출함을 증명 */
var hello2 = function hell(){
    return 'hell';
}

console.log(hello2());
/*  
    함수의 이름(hell)이 아닌 식별자(hello2)를 호출하기에 
    hell is not defined Exception 발생
*/
//          

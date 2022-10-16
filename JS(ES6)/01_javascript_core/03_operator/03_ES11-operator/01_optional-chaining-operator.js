/* 01. optional-chaining-operator(옵셔널 체이닝 연산자) */
/* EC11(ECMAScript2020)에서 도입된 연산자로 좌항의 피연산자가 null 또는 undefined인 경우
   undefined를 반환하고
   그렇지 않으면 우항의 프로퍼티 참조를 이어간다.
*/

var obj = null;

// var val = obj.value;
// console.log(val);            // Cannot read properties of null 

var val = obj?.value;           // npe 방지 코드 개념
console.log(val);               // undefined

var str = '';                   // falsy하지만 null이나 undefined가 아닌 경우
var len = str?.length;
console.log(len);
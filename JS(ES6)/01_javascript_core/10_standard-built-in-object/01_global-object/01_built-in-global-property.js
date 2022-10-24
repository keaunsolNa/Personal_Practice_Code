/* 01. global-property(전역 객체) */
/*
    전역 객체는 코드가 실행되기 이전 단계에 자바스크립트 엔진에 의해 어떤 객체보다도 먼저 생성되는 특수한 객체
    어떤 객체에도 속하지 않는 최상위 객체
    Node.js 환경에서는 golbal이 전역 객체, 브라우저 환경에서는 window가 전역 객체
*/

console.log(this); 

/* 빌트 인 전역 객체의 프로퍼티 호가인 */
console.log(Object.getOwnPropertyDescriptors(global));

/* Infinity */
console.log(global.Infinity);                           
console.log(10/0);

/* NaN */
console.log(global.NaN);
console.log(Number('abc'));

/* undefined */
console.log(global.undefined);
var nothing;
console.log(nothing);


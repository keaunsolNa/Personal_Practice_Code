/* 기본적인 연산자의 사용은 Java와 다르지 않다. (추가적이거나 다른 부분만 다룰 예정) */

/* 01. comparison-operator */

/* 동등/동일(일치) 비교 연산자 */
/*
    동등 비교(loose equality) 연산자와 동일(일치) 비교(strict equality) 연산자는 비교하는 엄격성의 정도가 다르다.
    동등 비교(==, !=) 연산자는 먼저 암묵적 타입 변환을 통해 타입을 일치시킨 후 같은 값을 지녔는지 비교한다.
    동일(일치) 비교(===, !==) 연산자는 타입과 값이 모두 일치하는지를 비교한다.
*/

/* 1. 숫자 1, 문자 '1', true 비교 */
console.log(`1 == '1' : ${1 == '1'}`);                      // true
console.log(`1 == true : ${1 == true}`);                    // true
console.log(`1 == '1' : ${1 === '1'}`);                     // false
console.log(`1 == true : ${1 === true}`);                   // false

/* 2. 숫자 0, 문자 '0', 빈문자열 '', false 비교 */
console.log(`0 == '0' : ${0 == '0'}`);                      // true
console.log(`0 == '' : ${0 == '0'}`);                       // true
console.log(`0 == false : ${0 == '0'}`);                    // true
console.log(`0 === '0' : ${0 === '0'}`);                    // false
console.log(`0 === '' : ${0 === ''}`);                      // false
console.log(`0 === false : ${0 === false}`);                // false

/* 3. null, undefined 비교 */
console.log(`null == undefined : ${null == undefined}`);    // true
console.log(`null === undefined : ${null == undefined}`);   // false

/* 4. NaN은 자신과 일치하지 않는 유일한 값이다. */
console.log(`NaN == NaN : ${NaN == NaN}`);                  // false
console.log(`NaN === NaN : ${NaN === NaN}`);                // false

console.log(`Number.isNaN(NaN) : ${Number.isNaN(NaN)}`);    // true

/* 5. 일치하지 않는 값 비교 */
console.log(`1 != '1' : ${1 != '1'}`);                      // false
console.log(`1 !-- '1' : ${1 !== '1'}`);                    // true

/* 자바스크립트는 문자열 대소 비교도 가능하다. */
console.log(`'1234' == '3456' : ${'1234' == '3456'}`);      // false
console.log(`'1234' == '1234' : ${'1234' == '1234'}`);      // true
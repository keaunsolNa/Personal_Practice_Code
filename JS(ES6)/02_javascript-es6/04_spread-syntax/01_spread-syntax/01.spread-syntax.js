/* 01. spread syntax(스프레드 문법, 전개 문법) */
/* 하나로 뭉쳐 있는 여러 값(문자열, 배열, 객체)들의 집합을 전개해서 개별적인 값들의 목록으로 만든다. */

console.log(`가장 큰 값: ${Math.max(10, 30, 20)}`);                             // 가장 큰 값: 30

/* 배열을 인수 목록으로 확장해 보기 */
let arr = [10, 20, 30];
console.log(...arr);                                                            // 10 20 30
console.log(`가장 큰 값: ${Math.max(...arr)}`);                                 // 가장 큰 값: 30

let arr1 = [10, 30, 20];
let arr2 = [100, 300, 200];

console.log(...arr1, ...arr2);                                                  // 10 30 20 100 300 200
console.log(`두 배열에서 가장 작은 값 : ${Math.min(...arr1, ...arr2)}`);        // 두 배열에서 가장 작은 값 : 10

/* 일반 값과 혼합해서도 사용 가능하다. */
console.log(`가장 작은 값: ${Math.min(1, ...arr1, 2, ...arr2, 3)}`);            // 가장 작은 값: 1

/* 배열의 병합에서도 배열에서 제공하는 concat 메소드보다 간단하게 처리할 수 있다. */
let merged = [10, ...arr1, ...arr2, 2];
console.log(merged);                                                            // [10, 10, 30, 20, 100, 300, 200, 2]

/* 문자열일 때 */
let str = "JavaScript";
console.log(...str);                                                            // J a v a S c r i p t
console.log([...str]);                                                          // 스프레드 연산자로 문자 하나씩 들어간 배열을 쉽게 만들 수도 있다.
console.log(Array.from(str));                                                   // 무언가를 배열로 바꿀 때 보편적으로 사용하는 배열의 from 메소드

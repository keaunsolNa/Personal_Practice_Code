/* 02. let */
/* var 키워드의 단점을 보완하기 위해 ES6에서는 새로운 변수 선언 키워드인 let, const를 도입했다. */

/* 1. 변수 중복 선언 금지 */
let msg = "안녕하세요";

// let msg = "안녕히 가세요";                   // 에러 발생

/* 2. 블록 레벨 스코프 */
let i = 0;
for(let i = 0; i < 10; i++){
    console.log(`지역 변수 i : ${i}` )
}
confirm.log(`전역 변수 i : ${i}`)

/* 3. 변수 호이스팅을 방지하는 효과 */
/* 
    let 키워드로 선언한 변수는 변수 호이스팅이 발생하지 않는 것처럼 동작한다.
    let 키워드는 선언 단계와 초기화 단계를 분리하여 선언은 인지하였지만 초기화가 되지 않게 해서 오류를 발생 시킨다.
*/
console.log(x);
let x;                                          // Cannot access 'x' before initialization


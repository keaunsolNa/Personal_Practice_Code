/* 02. convert-to-number(숫자 타입으로 변환) */

console.log('==== 숫자 타입으로 변환 ====');

/* 더하기를 제외한 산술 연산자는 피연산자들이 숫자여야 하므로 피연산자들을 숫자 타입으로 암묵적 타입 변환한다. */
console.log(10 - '5');
console.log(10 * '5');
console.log(10 / '5');
console.log(10 % 'Javascript');

/* 비교 연산자로 크기를 비교하기 위해 모두 숫자 타입이여햐 하므로, 피 연산자들을 숫자 타입으로 암묵적 타입 변환한다. */
console.log(10 > '5');

/* + 단항 연산자로 숫자 타입으로 암묵적 타입 변환이 가능하다. */
console.log(+'');                   // 0
console.log(+'1');                  // 1
console.log(+'Javascript');         // NaN
console.log(+true);                 // 1
console.log(+false);                // 0
console.log(+null);                 // 0
console.log(+undefined);            // NaN
// console.log(+Symbol());          // Cannot convert a Symbol value to a number
console.log(+{});                   // NaN
console.log(+[]);                   // 0
console.log(+function(){});         // NaN

/* 빈 문자열, 빈 배열, null, false는 0으로, true는 1로 반환한다. */
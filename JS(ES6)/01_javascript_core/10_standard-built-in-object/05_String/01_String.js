/* 01. String */
/* 표준 빌트인 객체인 String은 원시 타입인 문자열을 다룰 때 유용한 프로퍼티와 메소드를 제공한다. */

const obj = new String();
console.log(obj);                   // 인수 전달하지 않으면 빈 문자열을 할당한 객체 생성

const obj2 = new String('홍길동');
console.log(obj2);                  // 인수로 문자열 전달 시 전달받은 문자열 할당

/* 첫번째 문자 추출 */
console.log(obj2[0]);               // 홍
console.log(obj2.length);           // 3

/* 
    String은 length 프로퍼티(문자열의 문자계수)와 인덱스를 나타내는 숫자 형식의 문자열을 
    프로퍼티 키로, 각 문자를 프로퍼티 값으로 가진다.
*/

/* 문자열이 아닌 값을 인수로 전달했을 경우 문자열로 강제 변환한다. (명시적 타입 변환 참조) */
const obj3 = new String(100);       // 100 -> '100'
const obj4 = new String(null);      // null -> 'null'

console.log(obj3[0]);               // 1
console.log(obj4[0]);               // n

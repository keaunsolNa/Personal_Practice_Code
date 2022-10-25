/* 04. example */

/* 1. 특정 단어로 시작하는지 검사하는 경우 */
const url = 'https://www.google.com';
const url2 = 'http://www.google.com';

/* http:// 또는 https://로 시작하는지 검사 */
console.log(/^https?:\/\//.test(url));                  // true
console.log(/^https?:\/\//.test(url2));                 // true

/* 2. 특정 단어로 끝나는지 검사하는 경우 */
const fileName = 'js_test.js';
const fileName2 = 'js_test.com';

/* 문자열이 js로 끝나는지 검사 */
console.log(/js$/.test(fileName));                      // true
console.log(/js$/.test(fileName2));                     // false

/* 3. 숫자로만 이루어진 문자열인지 검사 */
const target = '12345';
const target2 = '@12345@';
console.log(/^\d+$/.test(target));                      // true
console.log(/^\d+$/.test(target2));                     // false

/* 4. 아이디로 사용 가능한지 검사 */
const id = 'hello123';
const id2 = '가hello123';
const id3 = 'hello1234567890'
/* 알파벳, 숫자로 된 6~12자의 문자로 시작하고 끝남 */
console.log(/^[A-Za-z0-9]{6,12}$/.test(id));            // true
console.log(/^[A-Za-z0-9]{6,12}$/.test(id2));           // false
console.log(/^[A-Za-z0-9]{6,12}$/.test(id3));           // false

/* 5. 핸드폰 번호 양식에 맞는지 검사 */
const phone = '010-1234-5678';
const phone2 = '02-1234-5678';
console.log(/^[0-9]{3}-\d{3,4}-\d{4}$/.test(phone));    // true
console.log(/^[0-9]{3}-\d{3,4}-\d{4}$/.test(phone2));   // false

/* 6. 특수 문자 포함 여부 검사 */
const exceptT = 'hello#world';
const except2 = 'hello@world';
console.log(/[^A-Za-z0-9]+/.test(exceptT));             // true, 알파벳 및 숫자가 아닌 문자가 들어있다는 의미

console.log(/^[^@]+$/g.test(except2));                  // @ 있으면 false, 없으면 true
/* 이보다 정교한 패턴들은 추후 찾아가며 이해하고 적용해 보자. */

/* 그룹 관련 추가예제 */
let target3 = 'https://www.google.com';

/* 그룹을 두개 만들고 배열에 하나씩 요소로 담고 싶을 때 */
// let regex = /(https:)([\/a-z\/.]+)/;

/* 첫번째 그룹은 배열의 요소로 뽑고 싶지는 않을 때(단순 ()의 의미는 ()안에 ?:를 붙인다.) */
let regex = /(?:https:)([\/a-z\.]+)/;                   // https: 가 있어도 되고 없어도 되지만 배열로는 나오지 않는다.

console.log(target3.match(regex));

/* 7. 한글 범위 여부 검사 */

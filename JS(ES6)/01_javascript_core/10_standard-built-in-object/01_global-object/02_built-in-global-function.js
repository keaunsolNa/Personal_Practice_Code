/* 02. built-in-global-function(빌트인 전역 함수) */

/* isFinite : 무한한 값인가? */
console.log(global.isFinite(10));                           // true
console.log(global.isFinite(Infinity));                     // false

/* isNaN : 숫자가 아닌가? */
console.log(isNaN(NaN));                                    // true
console.log(isNaN(10));                                     // false

/* url에서 한글이 안 깨지고 나오게 할 때 사용할 함수 */
/* encodeURIComponent */
/* 알파벳, 0~9숫자, -_.!~*'() 문자를 제외하고 인코딩 한다. */
const uriComp = 'name=홍길동&job=student';
const encComp = encodeURIComponent(uriComp);
console.log(encComp);                                       // name%3D%ED%99%8D%EA%B8%B8%EB%8F%99%26job%3Dstudent

/* 나중에 백단에서 url 값으로 넘어오는 한글이 깨지면 사용하게 될 함수 */
/* decodeURIComponent */
const decComp = decodeURIComponent(encComp);
console.log(decComp);                                       // name=홍길동&job=student



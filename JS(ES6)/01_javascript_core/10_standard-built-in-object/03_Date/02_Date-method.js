/* 02_Date-method */

/* Date.now : 1970년 1월 1일 00:00:00(UTC)를 기점으로 현재 시간까지 경과한 밀리초를 숫자로 반환한다. */
const now = Date.now();
console.log(new Date(now));

/* 연, 월, 일, 시, 분, 초, 밀리초 반환 및 설정 */
const date = new Date();
console.log(date.getFullYear());
console.log(date.getMonth());
console.log(date.getDate());
console.log(date.getDay());                 // 일요일부터 0~6으로 반환
console.log(date.getHours());
console.log(date.getMinutes());
console.log(date.getSeconds());
console.log(date.getMilliseconds());

date.setFullYear(2020);
date.setMonth(0);
date.setDate(1);
date.setHours(9);
date.setMinutes(10);
date.setSeconds(10);
date.setMilliseconds(10);
console.log(date);
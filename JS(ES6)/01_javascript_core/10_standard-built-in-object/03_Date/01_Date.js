/* 01. Date(날짜 빌트인 함수) */

/*
    UTC(합정 세계시)       : 국제 표준시로 기술적인 표기에서 사용한다. (영국 런던 기준) (JAVA 기준)
    GMT(그리니치 평균시)   : UTC와 초의 소수점 단위에서만 차이가 나기 때문에 일상에서는 혼용하여 사용한다. (JS 기준)
    KST(한국 표준시)       : UTC + 9시간
*/

/* 1. new Date() */
/* 1970년 1월 1일 00:00:00(UTC)를 기점으로 몇 밀리초가 지났는지를 계산해서 나온 현재 시스템 시간 */
console.log(new Date());

/* 2. new Date(milliseconds) */
console.log(new Date(0));
console.log(new Date(24 * 60 * 60 * 1000));             // 하루 뒤

/* 3. new Date(dateString): 날짜의 시간을 나타내는 문자열을 인수로 전달하면 지정 된 날짜와 시간을 나타내는 Date 객체 반환 */
console.log(new Date('Jul 29, 2022 09:00:00'));         // 2022-07-29T00:00:00.000Z
console.log(new Date('2022/07/26/09:00:00'));           // 2022-07-26T00:00:00.000Z

/* 4. new Date(year, monty[, day, hour, minute, second, millsecond]) */
/* : 연, 월, 일, 시, 분, 초, 밀리초를 의미하는 숫자를 인수로 전달하면 지정 된 날짜와 시간을 나타내는 Date 객체 반환 */
/* month(0 ~ 11) */
console.log(new Date(2022, 1));
console.log(new Date(2022, 1, 1, 9, 0, 0, 0));

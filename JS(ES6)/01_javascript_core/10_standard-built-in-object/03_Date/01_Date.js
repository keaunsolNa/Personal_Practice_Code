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
console.log(new Date(24 * 60 * 60 * 1000));         // 하루 뒤




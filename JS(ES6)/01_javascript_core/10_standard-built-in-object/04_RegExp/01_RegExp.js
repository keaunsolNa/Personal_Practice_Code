/* RegExp(정규 표현식) */
/* 
    정규 표현식(Regular Expression)은 일정한 패턴을 가진 문자열의 집합을 표현하기 위해 사용하는 형식 언어(Formal language)
    이다. 정규 표현식은 대부분의 프로그래밍 언어와 코드 에디터에 내장되어 있다.
    문자열을 대상으로 한 패턴 매칭 기능을 제공하므로 예를 들어 회원 가입 시 필요한 사용자가 입력한 비밀번호의 패턴 확인,
    전화번호의 유효성 확인 등의 기능에서 활용할 수 있다.
*/

/* 검색 대상 */
const target = 'JavaScript';

/* 1. 정규 표현식 리터럴(/pattern/flag) */
let regexp = /j/i;                  // 패턴 j, 플래그 i => 대소문자 상관 없이 j가 있는지 판별

/* 2. RegExp 생성자 함수(new RegExp(pattern[, flag])) */
regexp = new RegExp('j', 'i');
regexp = new RegExp(/j/, 'i');
regexp = new RegExp(/j/i);

/* test 메소드 : 정규 표현식 regexp의 패턴을 검색하여 해당 결과를 boolean값으로 반환 */
console.log(regexp.test(target));   // true



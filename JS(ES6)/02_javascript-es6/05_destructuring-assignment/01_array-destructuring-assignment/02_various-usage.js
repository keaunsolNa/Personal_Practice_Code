/* 02. various-usage(다양한 사용법) */

/* 객체의 프로퍼티에도 값을 담을 수 있다.(객체의 프로퍼티 뿐 아니라 대입할 수 있는 대상이면 좌측은 상관 없다.) */
let user = {};
[user.firstName, user.lastName] = "Gwansoon Yu".split(" ");

console.log(user.firstName);                                // Gwansoon
console.log(user.lastName);                                 // Yu
console.log(user);                                          // { firstName: 'Gwansoon', lastName: 'Yu' }

/* 나머지 요소를 한번에 가져오기(rest parameter(나머지 매개변수, 스프레드 연산자가 아니다.)) */
let [sign1, sign2, ...rest] = ["양자리", "황소자리", "쌍둥이자리", "개자리", "사자자리"];

console.log(sign1);                                         // 양자리
console.log(sign2);                                         // 황소자리
console.log(rest);                                          // [ '쌍둥이자리', '개자리', '사자자리' ]

/* 변수 교환 용도로도 사용할 수 있다. */
let student = "유관순";
let teacher = "홍길동";

[student, teacher] = [teacher, student];        

console.log(`학생 : ${student}, 교사 : ${teacher}`);        // 학생 : 홍길동, 교사 : 유관순

/* 기본 값을 설정하고 사용할 수도 있다. */
let [firstName4 = "아무개", lastName4 = "김"] = ["길동"];

console.log(firstName4);                                    // 길동
console.log(lastName4);                                     // 김

/* parameter-and-argument(매개변수와 인수) */

/* 함수 선언문 */
function hello(name){

    /* 매개변수는 함수 블럭 내부에서만 참조할 수 있다. */
    console.log(name);                      // 홍길동

    /* 모든 함수는 암묵적으로 arguments 객체의 프로퍼티로 보관된다. */
    console.log(arguments);                 // [Arguments] { '0': '홍길동', '1': '유관순' } 
                                            // 가변인자 함수 구현 시 유용하게 사용 된다.

    return `${name}님 안녕하세요!`;
};

/* 함수 호출(매개변수의 개수와 인수의 개수가 일치하는지 체크하지 않는다.) */
var result = hello('홍길동');
console.log(result);                        // 홍길동님 안녕하세요!

result = hello();
console.log(result);                        // undefined님 안녕하세요!

result = hello('홍길동', '유관순');
console.log(result);                        // 홍길동님 안녕하세요!

/* 기본 값 추가 함수 */
function hi(name = '아무개') {

    /* 적절한 인수가 전달 되었는지 확인하는 방법 */
    if(arguments.length !== 1 || typeof name !== 'string' || name.length === 0)
        throw new TypeError('인수는 1개여야 하고 문자열 값이며 빈 문자열을 허용하지 않습니다.');
    return `${name} 안녕~`;

}

/* 인수를 던지지 않으면 기본값을 활용한다. */
// result = hi();

/* 조건 처리와 예외를 던지는 구문으로 TypeError 발생 확인 */
// result = hi(1);
result = hi('');

console.log(result);                        // TypeError 발생
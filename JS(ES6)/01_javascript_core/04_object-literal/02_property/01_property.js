/* 01. property */
/* 객체는 프로퍼티의 집합이며, 프로퍼티는 키와 값으로 구성 된다. */

var student = {
    
    /* 프로퍼티 키는 name, 프로퍼티 값은 '유관순' */
    name : '유관순',

    /* 프로퍼티 키는 age, 프로퍼티 값은 16 */
    age : 16,

    /* 프로퍼티 나열은 수미표로 구분하며 마지막 프로퍼티 뒤에 쉼표를 사용해 된다. */
};

console.log(student);

/*
    프로퍼티 키 : 빈 문자열을 포함하는 모든 문자열 또는 symbol 값 => 프로퍼티 값에 접근하기 위한 식별자
    문자열이므로 홑따움표를 사용하지만 식별자 네이밍 규칙을 따르는 경우 사용하지 않아도 된다.($_)
    단, 식별자 네이밍 규칙을 따르지 않는 이름은 홑따움표를 반드시 사용해야 한다.

    프로퍼티 값 : 자바스크립트에서 사용할 수 있는 모든 값.
*/
var obj = {
    normal : 'normal value',
    '@ s p a c e @' : 'space value',
    '' : '',                                    // 빈 문자열 키 : 오류는 발생하지 않지만 권장되지 않는다.
    0 : 1,                                      // 숫자 키 : 내부적으로 문자열로 반환된다.
    var : 'var',                                // 예약어 키 : 오류는 발생하지 않지만 권장되지 않는다. 
    normal : 'new value'                        // 이미 존재하는 키를 중복 선언하면 나중에 선언한 프로퍼티가 기존 프로퍼티를 덮어쓴다.
};

console.log(obj);

/* 프로퍼티 키와 값을 동적으로 추가(생성) 할 수 있다. */
var key = 'test';
obj[key] = 'test value';

console.log(obj);

/* 프로퍼티 추가 순서는 정수 프로퍼티는 자동으로 정렬되고, 그 외의 프로퍼티는 객체에 추가한 순서 그대로 정렬 */

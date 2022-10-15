/* 05. symbol-and-object */

/* symbol 타입 */
/*
    symbol은 ES6에서 추가 된 7번째 타입으로 변경 불가능한 원시 타입의 값이다. 
    다른 값과 중복 되지 않는 유일무이한 값으로 이름이 충돌할 위험이 없는
    객체의 유일한 프로퍼티 키를 만들기 위해 사용한다.
    symbol 이외의 원시 값은 리터럴을 통해 생성하지만 symbol은 
    Symbol 함수를 통해 호출해 생성한다.
*/
// var key1 = 'key';
// var key2 = 'key';
var key1 = Symbol('key');
var key2 = Symbol('key');
console.log(typeof key1);
console.log(typeof key2);

/* 리터럴 객체 생성 */
var obj = {};

/* 이름 충돌할 위험이 있을 때 유일무일한 값인 symbol을 프로퍼티 키(속성명)로 사용한다. */
obj[key1] = 'value1';       // In Java = class obj{ String key1; String key2; } new obj();
obj[key2] = 'value2';
console.log(obj[key1]);
console.log(obj[key2]);     // = { ['key'] : 'value1';    ['key'] : 'value2';}

/* 지금은 데이터 타입의 한 종류라고만 이해하고 넘어가도 괜찮다. (자세한 내용은 ES6 때 다룰 예정) */

/* 객체 타입 */
/* 
    자바스크립트를 이루고 있는 거의 모든 것이 객체이다.
    number, string, boolean, undefined, null, symbol의 6가지 데이터 타입 이외는 모두
    객체 타입이다.
    객체, 함수, 배열 등에 대해서 추후 하나씩 다뤄보자. 
*/
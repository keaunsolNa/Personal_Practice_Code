/* 03. property-accessor(프로퍼티 접근) */
var dog = {
    name : "뽀삐",
    eat : function(food){
        console.log(`${this.name}(은)는 ${food}를 맛있게 먹어요.`);
    }
}

/* 1. 마침표 표기법(dot notation) */
console.log(dog.name);
dog.eat('고구마');

/* 2. 대괄호 표기법(square braket notation) - 프로퍼티 키는 반드시 홑따움표로 감싼 문자열을 사용한다. */  
console.log(dog['name']);
dog['eat']('피자');

/* 대괄호 표기법만 가능한 경우 */
var obj = {
    'dash-key' : 'dash-value',
    0 : 1
};

/* 프로퍼티 키가 식별자 네이밍 규칙을 준수하지 않은 이름인 경우 반드시 대괄호 표기법을 사용한다. (반드시 홑따움표로 감쌀 것.) */
// console.log(obj.dash-key);
// console.log(obj.'dash-key');
// console.log(obj[dash-key]);
console.log(obj['dash-key']);

/* 프로퍼티 키가 숫자로 이루어진 경우 홑따움표를 생략할 수 있지만 대괄호 표기법을 사용해야 한다. */
// console.log(obj.0);
// console.log(obj.'0');
console.log(obj[0]);
console.log(obj['0']);
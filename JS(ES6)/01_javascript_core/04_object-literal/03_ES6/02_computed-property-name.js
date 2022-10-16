/* 02. computed-property-name (계산된 프로퍼티 이름) */
var prefix = 'key';
var index = 0;

var obj ={};

/* 대괄호 표기법을 사용해야 한다. (ES5) */
obj[prefix + '-' + index++] = index;
obj[prefix + '-' + index++] = index;
obj[prefix + '-' + index++] = index;

console.log(obj);

/* ES6에서는 객체 리터럴 내부에서도 계산된 이름으로 프로퍼티 키를 동적으로 생성할 수 있다. */
var obj2 = {
    [`${prefix}-${index++}`] : index,
    [`${prefix}-${index++}`] : index,
    [`${prefix}-${index++}`] : index
}

console.log(obj2);
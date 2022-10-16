/* 01. in-operator(in 연산자) */
/* 프로퍼티 존재 여부 확인하기 */
var student = {
    name : '유관순',
    age : 16,
    test : undefined
};

console.log("name" in student);             // true  - 존재
console.log('height' in student);           // false - 존재하지 않음
console.log("test" in student);             // true  - 존재

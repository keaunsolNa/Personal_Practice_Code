/* 01. arrow-function-basic-syntax(화살표 함수 기본 문법) */

var message;

message = function(){
    return "Hello World";
};

console.log(message());

message = () => {
    return "Arrow Function!";
};
console.log(message());
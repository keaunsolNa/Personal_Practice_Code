/* 01 object-constructor-prototype(생성자 함수 프로토타입) */
const user = {
    activate : true,
    login : function(){
        console.log('로그인 되었습니다.');
    }
};

function Student(name) {
    this.name = name;
};

console.log(Student.prototype);                             // {}
Student.prototype = user;

let std = new Student('홍길동');

console.log(std);                                           // { name: '홍길동' }
console.log(std.activate)                                   // true


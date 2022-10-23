/* 01. [[Prototype]](프로토 타입 객체) */
/* 모든 객체는 프로토타입 객체에 접근할 수 있다. */
 
const user = {
    activate : true,
    login : function(){
        console.log('로그인 되었습니다.');
    }
}

/* 
    함수와 프로토타입 객체가 서로 쌍으로 만들어진다.
    함수는 prototype이라는 자동 생성되는 프로퍼티로 프로토타입을 바라볼 수 있고 (객체)
    프로토타입 객체는 constructor 라는 프로퍼티로 함수를 바라볼 수 있다..
    객체는 __proto__라는 자동 생성되는 프로퍼티로 자신의 프로토타입 객체를 바라볼 수 있다. (객체)

    리터럴 객체는 Object라는 기본 제공되는 함수와 Object의 프로토타입 객체를 통해
    만들어졌고 정확하게는 Object의 프로토타입 객체를 상속 받아 만들어 진다. (프로토타입 상속)
*/

console.log(user.__proto__);                            // [Object: null prototype] {}
console.log(user.__proto__.constructor);                // [Function: Object]
console.log(Object);                                    // [Function: Object]

/* Object의 프로토타입 함수 */
console.log(user.__proto__.constructor === Object);     // true

/* Object의 프로토타입 객체 */
console.log(Object.prototype === user.__proto__);       // true

function test() {

}

console.log(test.prototype);                            // {}

/* 리터럴 객체 */
const user2 = {
    activate : false,
    login : function(){
        console.log("로그인 실패하셨습니다.");
    }
};
console.log(user2.__proto__);                           // [Object: null prototype] {}

const student = {
    passion : true
}
console.log(student.__proto__);                         // [Object: null prototype] {}

student.__proto__ = user2;

console.log(student.__proto__);                         // { activate: false, login: [Function: login] }

student.login();                                        // 로그인 실패하셨습니다.

/* student의 프로토타입 객체를 user2로 바꾼 이후 user2의 프로퍼티를 물려받아 student의 프로퍼티가 늘어남을 확인 */
for(let prop in student){
    console.log(prop);                                  // passion, activate, login
}

/* 프로토타입 체인 */
const greedyStudent = {
    class : 1502,
    __proto__ : student
};

for(let prop in greedyStudent){
    console.log(prop);                                  // class, passion, activate, login, p
}

console.log(greedyStudent.activate);                    // false, user2에서 상속
console.log(greedyStudent.passion);                     // true, student에서 상속

/* __proto__의 값은 객체 또는 null만 가능하며 다른 자료형은 무시된다. */
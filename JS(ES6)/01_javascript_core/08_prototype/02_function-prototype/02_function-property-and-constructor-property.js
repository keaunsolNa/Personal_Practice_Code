/* 02_function-property-and-constructor-property (함수 프로퍼티와 프로토타입의 프로퍼티) */
/* 
    개발자가 특별히 할당하지 않더라도 모든 함수는 기본적으로 "prototype" 프로퍼티를 가진다. 
    함수의 프로토타입 객체도 "constructor"라는 프로퍼티를 가진다. (디폴트 프로퍼티 설명)
    함수와 프로토타입 객체는 디폴트 프로퍼티를 통해 서로 참조할 수 있다.

    Student.prototype = {constructor : Student}
*/


function Student() {}

console.log(Student.prototype.constructor == Student);              // true

let student = new Student();
console.log(student.constructor == Student);                        // true, 해당 객체의 생성자 함수를 알 수 있다.


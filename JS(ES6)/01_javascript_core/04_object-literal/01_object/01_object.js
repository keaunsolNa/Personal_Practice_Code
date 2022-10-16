/* 01_object(객체) */
/* 자바스크립트는 객체 기반 프로그래밍 언어로 원시 값을 제외 한 나머지 값(함수, 배열, 정규 표현식 등)은 모두 객체이다. */

var student = {

    /* 키-값의 쌍으로 구성된 프로퍼티 */
    /* 프로퍼티 : 객체의 상태를 나타내는 값(data) */
    name : '유관순',
    age : 16,

    /* 메소드: 프로퍼티(상태 데이터)를 참조하고 조작할 수 있는 동작(behavior)(기능) */
    getInfo : function(){
        return `${this.name}(은)는 ${this.age}세 입니다.`;
    }
};

console.log(student);                   // { name: '유관순', age: 16, getInfo: [Function: getInfo] }
console.log(typeof student);            // object

console.log(student.getInfo);           // [Function: getInfo]
console.log(student.getInfo());         // 유관순(은)는 16세 입니다.

student.name = '홍길동';
student.age = '44';

/* 메소드 안의 this는 메소드를 호출한 대상이다. */
console.log(student.getInfo());         // 홍길동(은)는 44세 입니다.

/* 객체 리터럴의 중괄호는 코드 블록을 의미하지 않는다. 따라서 닫는 중괄호 뒤에는 세미콜론을 붙인다. */
/* 객체 리터럴 외의 객체 생성 방식들은 모두 함수를 사용해서 생성하므로 함수 학습 이후에 다시 학습할 예정이다. */
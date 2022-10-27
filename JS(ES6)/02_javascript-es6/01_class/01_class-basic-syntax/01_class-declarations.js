/* 01_class basic syntax(클래스 기본 문법) */

/* 01. class-declarations(클래스 선언) */
class Student {

    /* 생성자는 2개 이상 정의 될 수 없으며 생략할 경우 암묵적으로 정의 된다. 내부적으로는 생성자 함수로 변환된다. */
    constructor(name) {
        this.group = 1501;                                      // 고정 값으로 프로퍼티 초기화
        this.name = name;                                       // 인수로 프로퍼티 초기화
    }

    /* class의 메소드는 프로토타입 객체의 메소드가 된다. */
    introduce(){
        console.log(`안녕하세요 저는 ${this.group}강의실 학생 ${this.name} 입니다.`);
    }
}

let student = new Student('홍길동');
console.log(student);                                           // Student { group: 1501, name: '홍길동' }

student.introduce();                                            // 안녕하세요 저는 1501강의실 학생 홍길동 입니다.
console.log(student.__proto__);                                 // {}

/* 이렇게 만들어진 프로퍼티 객체 살펴보기 */
console.log(Object.getOwnPropertyNames(student.__proto__));     // [ 'constructor', 'introduce' ]
console.log(Object.getOwnPropertyDescriptors(student.__proto__));

/* class를 활용해 만들어지는 객체도 결국 함수를 기반으로 만든 객체와 원리가 동잃하다. */
console.log(student.__proto__.constructor === Student);         // true

/* 원리를 적용해서 클래스 문법과 유사하게 기능하는 생성자 함수를 사용해 보자. */
function Teacher(name) {
    this.group = 1501;
    this.name = name;
}

Teacher.prototype.introduce = function(){
    console.log(`안녕하세요 저는 ${this.group}강의실 교사 ${this.name}입니다.`)
}

let teacher = new Teacher("김용승");
teacher.introduce();

/* 
    Student 예제 내용
    정리하면 new Student()를 호출하면 Student라는 이름을 가진 함수를 만들고 함수 본문은 생성자 메소드 constructor에서 가져온다.
    만약 생성자 메소드가 없으면 본문이 비워진 채로 함수가 만들어진다.
    클래스 내에 정의한 메소드는 프로토타입 객체에 저장한다.

    Teacher 예제 내용
    같은 원리로 생성자 함수를 가지고 유사한 개념을 만들 수도 있다.

    클래스와 생성자 함수의 차이점
    1. 클래스는 new와 함께 호출하지 않으면 에러가 발생한다.
    2. 클래스에 정의 된 메소드는 열거 불가하다. 반면 함수는 메소드도 열거 된다. 
*/

/* 프로토타입 객체에 있는 것은 객체를 for - in 문 돌렸을 때 확인할 수 있다. */
class Test{
    constructor () {
        this.name = '홍길동'
    }

    introduce(){
        return `이름 : ${this.name}`;
    }
}

function Test2(){
    this.name = '홍길동';
    this.introduce = function(){
        return `이름 : ${this.name}`;
    }
}

let obj1 = new Test();
let obj2 = new Test2();

for(let test in obj1){
    console.log(test);                  // name
}

for(let test in obj2){
    console.log(test);                  // name, introduce
}

console.log(obj1);                      // Test { name: '홍길동' }
console.log(obj2);                      // Test2 { name: '홍길동', introduce: [Function (anonymous)] }

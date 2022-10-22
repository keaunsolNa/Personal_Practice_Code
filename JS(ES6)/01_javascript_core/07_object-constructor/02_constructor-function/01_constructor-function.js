/* 01_constructor-function(생성자 함수) */

/* 1. 객체 리터럴 방식 */
const student1 = {
    name : '유관순',
    age : 16,
    getInfo : function(){
        return `${this.name}(은)는 ${this.age}세입니다.`;
    }
};

const student2 = {
    name : '홍길동',
    age : 26,
    getInfo : function() {
        return `${this.name}(은)는 ${this.age}세입니다.`;
    }
}

/*
    만약 수백명의 학생 객체를 만들어야 한다면?
    객체 리터럴 방식의 객체 생성 방식은 직관적이고 간편하지만, 단 하나의 객체만 생성한다.
    동일 프로퍼티를 가지는 여러 객체를 생성하는 것에 적합하지 않다.
*/

/* 2. 생성자 함수 방식 */
/*
    객체를 생성하기 위한 프로퍼티들을 하나의 탬플릿 개념으로 생성자 함수로써 작성하면
    동일한 프로퍼티를 가지는 여러 객체를 쉽게 생성할 수 있다.
*/
function Student(name, age){

    /* 이 생성자 함수를 통해 생성 될 객체가 this다. */
    this.name = name;
    this.age = age;
    this.getInfo = function(){
        return `${this.name}(은)는 ${this.age}세입니다.`;
    }
}

/* 생성자 함수를 활용한 인스턴스 생성 */
const student3 = new Student('장보고', 36);
const student4 = new Student("신사임당", 40);

/* 메소드 호출 */
console.log(student1);
console.log(student2);
console.log(student3.getInfo());
console.log(student4.getInfo());
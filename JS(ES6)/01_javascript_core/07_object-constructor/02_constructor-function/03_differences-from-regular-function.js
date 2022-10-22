/* 03_differences-from-regular-function (일반 함수와 차이점) */
function Student(name, age){
    this.name = name;
    this.age = age;
    this.getInfo = function(){
        return `${this.name}(은)는 ${this.age}세입니다.`;
    }
}

console.log(this);                                  // {}
/* 
    일반 함수와 생성자 함수의 특별한 형식적 차이는 없다. 
    (첫 문자를 대문자로 기술하여 구별하는 노력 정도)
    new 연산자 없이 호출하면 일반 함수로 동작한다.
*/
const student = Student("강감찬", 35);
console.log(student);                               // undefined
console.log(age);                                   // 35

/* 
    생성자 함수가 new 연산자 없이 호출 되는 것을 방지하기 위해 ES6에서는 new.target을 지원한다. (빌트 인 생성자 함수)
    new.target은 new 연산자와 같이 생성자 함수가 호출 될 시 함수 자신을 가리키고
    new 연산자를 사용하지 않고 생성자 함수 호출 시 undefined이다.
*/
    
function Dog(name, age){                            // undefined -> [Function: Dog]
    console.log(new.target);
    if(!new.target){                                // new 없이 함수 호출 시 true가 되게 하는 구문
        return new Dog(name, age);                  // new 연산자와 함께 생성자 함수를 재귀 호출하여 생성 된 인스턴스를 반환한다.
    }

    this.name = name;
    this.age = age;
}

const dog = Dog("뽀삐", 3);
console.log(dog);                                   // Dog { name: '뽀삐', age: 3 }

/* 
    new 연산자를 사용하지 않아도 일반함수가 아닌 객체를 생성하게 하는 생성자 함수(빌트인 생성자 함수)를 만들 수 있다.
    제공되는 빌트인 함수들 : Object, String, Number, Boolean, Date, RegExp, ...) 
*/
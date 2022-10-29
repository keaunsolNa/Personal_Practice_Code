/* 01. Symbol-feature(심볼 특징) */

let student = {
    name : "홍길동"
};

/* id 심볼을 생성해서 프로퍼티로 객체에 추가 */
let id = Symbol("id");                  // id 심볼 생성
student[id] = 1;                        // student 객체에 [id] (숨김)프로퍼티 추가

console.log(student);                   // { name: '홍길동', [Symbol(id)]: 1 }

/* 아래의 방법들로 확인할 때 symbol을 키로 가지는 프로퍼티는 마치 숨겨진 것처럼 확인이 안된다.(숨김 프로퍼티) */
console.log(Object.keys(student));      // [ 'name' ]
console.log(Object.getOwnPropertyDescriptors(student));

for(let key in student){
    console.log(key);                   // name
}

console.log(student[id]);               // 1

/* 리터럴 객체 안에서 사용할 경우 대괄호를 사용해 심볼형 키를 만들어야 한다. */
let student2 = {
    name : "유관순",
    age : 16,
    [id] : 2
};

for(let key in student2) console.log(key);  // name, age    for..in문에서 숨김 프로퍼티는 배제된다.

/*
    숨김 프로퍼티는 기존에 작성 된 코드에 영향을 주지 않고 새로운 프로퍼티를 추가하기 위해, 
    즉 하위 호환성을 보장하기 위해 도입 되었다.
*/

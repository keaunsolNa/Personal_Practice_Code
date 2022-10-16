/* 04. property-change-and-remove */

var dog = {
    name : "뽀삐"
};

/* 1. 프로퍼티 수정 */
dog.name = "두무";
dog['name'] = '두부';
console.log(dog);

/* 2. 프로퍼티 동적 추가 */
/* 존재하지 않는 프로퍼티에 접근해서 값을 할당하면 프로퍼티가 동적으로 생성 되어 추가되고, 프로퍼티 값이 할당 된다. */
dog.age = 3;
dog['age'] = 30;
console.log(dog);

/* 3. 프로퍼티 동적 삭제 */
delete dog.age;
delete dog['age'];

delete dog.something;       // 만약 존재하지 않는 프로퍼티를 삭제해도 에러 없이 무시된다.
console.log(dog);


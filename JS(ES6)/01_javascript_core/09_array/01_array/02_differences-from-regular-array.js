/* 02_differences-from-regular-array(일반적인 배열과의 차이점) */
/* 자바스크립트의 모든 값이 객체의 프로퍼티 값이 될 수 있으므로 모든 값이 배열의 요소가 될 수 있다. */
const arr = [
    '홍길동',
    20,
    true,
    null,
    undefined,
    NaN,
    Infinity,
    [],
    {},
    function(){}
];

console.log(arr);

/* 
    writable = true면 값을 수정할 수 있다. 아니면 읽기만 가능
    enumerable = true면 반복문을 사용해 나열할 수 있다. 아니면 반복문 활용 시 포함 안됨.
    configurable = true면 프로퍼티 삭제가 가능하다. 아니면 삭제가 불가능.
*/
console.log(Object.getOwnPropertyDescriptors([1, 2, 3]));     // 배열 객체만 가진 프로퍼티(프로토타입 객체의 프로퍼티 말고)를 자세히 보고 싶을 때 사용하는 메서드.
/*
{
  '0': { value: 1, writable: true, enumerable: true, configurable: true },
  '1': { value: 2, writable: true, enumerable: true, configurable: true },
  '2': { value: 3, writable: true, enumerable: true, configurable: true },
  length: { value: 3, writable: true, enumerable: false, configurable: false }
}
*/
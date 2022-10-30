/* 01. array-and-object-copy(스프레드 문법을 이용한 배열, 객체 복사) */

/* 1. 배열 복사 */
let arr = [10, 30, 20];
let arrCopy = [...arr];

console.log(arr);                               // [ 10, 30, 20 ]
console.log(arrCopy);                           // [ 10, 30, 20 ]
console.log(arr === arrCopy);                   // false

arrCopy.push(50);
console.log(arr);                               // [ 10, 30, 20 ]
console.log(arrCopy);                           // [ 10, 30, 20, 50 ]

/* 2. 객체 복사 */
let obj = { name : '홍길동', age : 20};
let objCopy = {...obj};

console.log(obj);                               // { name: '홍길동', age: 20 }
console.log(objCopy);                           // { name: '홍길동', age: 20 }
console.log(obj === objCopy);                   // false

objCopy.age = 30;
console.log(obj);                               // { name: '홍길동', age: 20 }
console.log(objCopy);                           // { name: '홍길동', age: 30 }



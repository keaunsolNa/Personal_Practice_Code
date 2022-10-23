/* 01. array(배열) */
/* 배열은 여러 개의 값을 순차적으로(인덱스를 활용하여) 나열한 자료구조이다. */

/* 1. 배열 리터럴을 통해 배열 생성 */
const arr = ['바나나', '복숭아', '키위'];

console.log(arr);                               // [ '바나나', '복숭아', '키위' ]
console.log(arr.length);                        // 3
console.log(typeof arr)                         // object
console.log(arr.__proto__);                     // Object(0) []

/* 2. 배열 생성자 함수 */
const arr2 = Array();                           // new 연산자를 안써도 되는 빌트인 생성자 함수 Array()를 통해 배열을 생성할 수도 있다.
console.log(arr2);                              // []

const arr3 = new Array(10);                     // 전달된 인수가 1개이고 숫자인 경우 해당 length 프로퍼티 값인 배열 생성
console.log(arr3);                              // [ <10 empty items> ]

const arr4 = Array(1, 2, 3);                    // 전달된 인수가 2개 이상이거나 숫자가 아닌 경우 인수를 요소로 갖는 배열 생성
console.log(arr4);                              // [ 1, 2, 3 ]

/* 배열의 요소는 자신의 위치를 나타내는 인덱스를 가지며 배열의 요소에 접근할 때 대괄호 표기법을 사용한다. */
console.log(arr[0]);                            // 바나나
console.log(arr[1]);                            // 복숭아
console.log(arr[2]);                            // 키위

/* 배열의 인덱스와 length 프로퍼티를 활용해 반복문을 활용할 수 있다. */
for(let i = 0; i < arr.length; i++){
    console.log(arr[i]);                        // 바나나, 복숭아, 키위
}

/* 
    자바스크립트에서 일반 객체와 배열은 큰 차이가 없고, 프로퍼티 키가 숫자형이라는 것과
    length라는 추가 프로퍼티를 가진다는 정도이다.
*/
console.log(typeof arr);                        // object

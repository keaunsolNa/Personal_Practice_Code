/* 01. array-destructuring-assignment-basic-syntax(구조 분해 할당 문법) */
/* 구조 분해 할당을 사용해 배열이나 객체를 각각의 변수로 '분해'하여 연결할 수 있다. */

/* 이름과 성을 요소로 가지는 배열 */
let nameArr = ["Gildong", "hong"];

// let firstName = nameArr[0];
// let lastName = nameArr[1];
let [firstName, lastName] = nameArr;

console.log(firstName);                             // Gildong
console.log(lastName);                              // hong

/* 반환 값이 배열인 메소드를 활용한 구조분해 할당 예제 */
// let [firstName2, lastName2] = "Saimdang Shin".split(" ");
let [firstName2, lastName2] = "Saimdang Shin".match(/[a-z]+/gi);

console.log(firstName2);                            // Saimdang
console.log(lastName2);                             // Shin

/* 쉼표를 활용하여 필요하지 않은 배열 요소를 버릴 수도 있다. */
let [firstName3, , lastName3] = ['firstName', 'middleName', 'lastName'];

console.log(firstName3);                            // firstName
console.log(lastName3);                             // lastName

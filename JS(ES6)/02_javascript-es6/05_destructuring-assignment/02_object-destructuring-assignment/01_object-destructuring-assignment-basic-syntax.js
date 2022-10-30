/* 01_object-destructuring-assignment-basic-syntax(객체 구조 할당 기본 문법) */

/* 상품명과 색상, 가격을 프로퍼티로 가지는 객체 */
let pants = {
    productName: "애기팬츠",
    color : "검정색",
    price : 30000
};

// let productName = pants.productName;
// let color = pants.color;
// let price = pants.price;
/* 객체 구조분해 할당은 객체의 프로퍼티와 일치하는 변수를 만들어 대입하는 과정을 줄여서 쓸 수 있다. (순서가 바뀌더라고 상관 없다.  */
// let {productName, color, price} = pants;
let {color, price, productName} = pants;

console.log(productName);                       // 애기팬츠
console.log(color);                             // 검정색
console.log(price);                             // 30000

/* {객체 프로퍼티: 목표 변수} 형식으로 작성할 수 있다. (다른 변수에 할당 가능) */
let {color:co, price:pr, productName:pn} = pants;
console.log(pn);                                // 애기팬츠
console.log(co);                                // 검정색  
console.log(pr);                                // 30000

/* 02. various usage */

let shirts = {
    productName: "베이직셔츠"
};

/* 객체에 존재하지 않는 프로퍼티는 기본 값을 생성해서 사용할 수 있다. */
/* 또한 콜론과 할당을 동시에 사용할 수 있다. */
let {productName: productName2 = "어떤 상품", color: color2 = "어떤 색상", price : price2 = 0} = shirts;

console.log(`productName2 : ${productName2}`);                  // productName2 : 베이직셔츠
console.log(`color2 : ${color2}`);                              // color2 : 어떤 색상
console.log(`price2 : ${price2}`);                              // price2 : 0

/* 프로퍼티가 많은 복잡한 객체에서 원하는 정보만 뽑아오는 것도 가능하다. (이 경우가 주로 사용 된다. ) */
let pants = {
    productName : "배기팬츠",
    color : "검정색",
    price : 20000
};

let {productName : productName3} = pants;

console.log(`productName3 : ${productName3}`);                  // productName3 : 배기팬츠

/* rest parameter ...로 나머지 요소를 한 번에 가져올 수도 있다. */

let {productName: productName4, ...rest} = pants;

console.log(`productName4 : ${productName4}`);                  // productName4 : 배기팬츠
console.log(`rest.color : ${rest.color}`);                      // rest.color : 검정색
console.log(`rest.price : ${rest.price}`);                      // rest.price : 20000
console.log(rest);                                              // { color: '검정색', price: 20000 }

/* 03.function-parameters(함수 매개변수에서의 구조분해 할당) */

let exampleProduct = {
    items: ["Coffe", "Donut"],
    producer: "신사임당"
};

function displayProduct(producer = "아무개", items = [], width = 10, height = 20){
    console.log(`${producer} ${width} ${height}`);                      // 신사임당 10 20
    console.log(items);                                                 // [ 'Coffe', 'Donut' ]
}

displayProduct(exampleProduct.producer, exampleProduct.items);

/* 함수의 매개변수에서 구조 분해 할당을 통해 개선해 보자. */
function displayProduct2({producer = "아무개", items = [], width = 10, height = 20}){
    console.log(`${producer} ${width} ${height}`);                      // 신사임당
    console.log(items);                                                 // [ 'Coffe', 'Donut' ]
}

displayProduct2(exampleProduct);
/* 03. method-shorthand(메소드 단축) */

var dog ={
    name : "뽀삐",
    eat : function(food){
        console.log(`${this.name}(은)는 ${food}를 맛있게 먹어요.`);
    }
};

dog.eat('고구마');

/* ES6에서는 메소드를 정의할 때 function 키워드를 생략한 축약 표현을 사용할 수 있다. */
var dog2 = {
    name : '두부',
    eat(food) {
        console.log(`${this.name}(은)는 ${food}를 맛있게 먹어요.`);
    }
};

dog2.eat('고구마');
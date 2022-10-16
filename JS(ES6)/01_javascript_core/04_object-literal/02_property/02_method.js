/* 02. method */
/* 자바 스크립트의 함수는 객체이다. 함수는 값으로 취급할 수 있고 프로퍼티 값으로 사용할 수 있다. */

var dog = {
    name : '뽀삐',
    eat : function(food){
        // console.log(`${name}(은)는 ${food}를 맛있게 먹어요.`);       // name is not defined Exception 
        console.log(`${this.name}(은)는 ${food}를 맛있게 먹어요.`);     // this.은 생략하면 안 된다. 

        return '잘 먹었네';
    }
};

console.log(dog.eat('banana'));

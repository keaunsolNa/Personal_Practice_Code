/* 01. inheritance-basic-syntax(상속 기본 문법) */

class Animal {
    constructor(name, weight){
        this.name = name;
        this.weight = weight;
    }

    eat(foodweight){
        this.weight += foodweight;
        console.log(`${this.name}(은)는 ${foodweight}kg의 식사를 하고 ${this.weight}kg이 되었습니다.`);
    }

    move(lostweight){
        if(this.weight > lostweight) this.weight -= lostweight;
        console.log(`${this.name}(은)는 움직임으로 인해 ${lostweight}kg 감량되어 ${this.weight}kg이 되었습니다.`);
    }
}

let animal = new Animal("동물", 30);

animal.eat(1);                                              // 동물(은)는 1kg의 식사를 하고 31kg이 되었습니다.
animal.move(0.5);                                           // 동물(은)는 움직임으로 인해 0.5kg 감량되어 30.5kg이 되었습니다.

class Human extends Animal {

    /* 생성자를 생략하면 super()를 활용해 부모 constructor를 사용하게 된다. */
    // constructor(name, weight){
    //     super(name, weight);
    // }

    // /* 상속 받고 추가적으로 프로퍼티를 가지고 싶으면 아래와 같이 작성한다. */
    // constructor(name, weight, language){
    //     super(name, weight);
    //     this.language = language;
    // }

    develop(language){
        console.log(`${this.name}(은)는 ${language}로 개발을 합니다. 정말 즐겁습니다.`);
        /* 부모 필드에는 접근 불가능 */ 
        // console.log(`${super.name}`);                       // undefined
        /* 메소드는 prototype 객체로부터 상속이기에 접근 가능 */
        // super.eat(2);                                       // 수강생(은)는 2kg의 식사를 하고 73kg이 되었습니다.
    }
}

/* Aniaml에 정의된 constructor 활용 가능 */
let human = new Human("수강생", 70);

/* Animal에 정의 된 메소드 접근 가능 */
human.eat(3);                                               // 수강생(은)는 3kg의 식사를 하고 73kg이 되었습니다.   
human.move(2);                                              // 수강생(은)는 움직임으로 인해 2kg 감량되어 71kg이 되었습니다.

/* Human에 정의 된 메소드 접근 가능 */
human.develop('Java');                                      // 수강생(은)는 Java로 개발을 합니다. 정말 즐겁습니다.


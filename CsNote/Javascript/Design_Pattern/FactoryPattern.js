const num = new Object(42)
const str = new Object('abc')
console.log(num.constructor.name);       // Number
console.log(str.constructor.name);       // String

class Latte {
    constructor() {
        this.name = "latte"
    }
}

class Espresso {
    constructor() {
        this.name = "Espresso"
    }
}

class LatteFactory {
    static createCoffe() {
        return new Latte();
    }
}

class EspressoFactory {
    static createCoffe(){
        return new Espresso()
    }
}

const factoryList = { LatteFactory, EspressoFactory }

class CoffeFactory {
    static createCoffe(type) {
        const factory = factoryList[type]
        return factory.createCoffe()
    }
}

const main = () => {

    // 라떼 커피 주문
    const coffe = CoffeFactory.createCoffe("LatteFactory")

    // 커피 이름을 부른다. 
    console.log(coffe.name)     // latte
}

main()
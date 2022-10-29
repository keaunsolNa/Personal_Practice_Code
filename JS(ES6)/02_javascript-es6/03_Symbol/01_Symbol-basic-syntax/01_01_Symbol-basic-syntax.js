/* 01. Symbol(심볼 타입) */
/* 01. Symbol-basic-syntax(심볼 기본 문법) */
/* 
    Symbol은 ES6에서 도입 된 7번째 데이터 타입으로 변경 불가능한 원시 타입의 값이다.
    Symbol은 다른 값과 중복 되지 않는 유일무이한 값으로 주로 이름 충돌의 위험이 없는 유일한 프로퍼티 키를 만들기 위해 사용된다.
*/

/* Symbol()을 사용하면 심볼 값을 만들 수 있다. */
let symbol1 = Symbol();

console.log(typeof symbol1);                        // symbol

/* 심볼 이름은 어떤 값에도 영향을 주지 않는 이름표 역할만 한다. */
let symbol2 = Symbol("mySymbol");
let symbol3 = Symbol("mySymbol");

console.log(symbol2);                               // Symbol(mySymbol)
console.log(symbol3);                               // Symbol(mySymbol)
console.log(symbol2 == symbol3);                    // false - symbol2와 symbol3는 지닌 이름만 같을 뿐 다른 값이다.

/* 전역 심볼 레지스트리 */
/* 
    전역 심볼 레지스트리(global symbol registry)에 심볼을 만들고 해당 심볼에 접근하면,
    이름이 같은 경우 항상 동일한 심볼을 반환한다. 
*/
let symbol = Symbol.for("id");
let idAgain = Symbol.for("id");

console.log(symbol);                                // Symbol(id)
console.log(idAgain);                               // Symbol(id)
console.log(symbol === idAgain);                    // true - 이름이 같은 두 전역 심볼은 완전히 일치한다.

/* 반대로 Symbol.keyfor(symbol)을 사용하면 이름을 받을 수 있다. */
console.log(Symbol.keyFor(symbol));                 // id

/*
    심볼은 이름이 같더라도 항상 값이 다르므로 이름이 같을 때 값도 같길 원한다면 전역 레지스트리를 사용해야 한다.
    전역 심볼 레지스트리는 애플리케이션 곳곳에서 심볼 이름을 이용해 특정 프로퍼티에 접근해야 할 경우 사용할 수 있다.
*/
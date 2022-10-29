/* 04. public-field-declaration(클래스 필드 정의) */
class Book {

    /* 클래스를 정의할 때 "프로퍼티 이름 = 값"을 써주면 클래스의 필드를 만들 수 있다. */
    /* 최신 브라우저(chrome 72 이상) 또는 최신 Node.js(버전 12 이상)에서만 실행 가능하다. */
    name = "모던 JavaScript";
    price;
    // this.no;                 // this.은 constructor 내부 또는 메소드 내부에서만 작성해야 한다. 

    introduce(){
        console.log(`${this.name}(이)가 그렇게 좋다죠~`);
    }
}

let book = new Book();
console.log(book);                                          // Book { name: '모던 JavaScript', price: undefined }

/* 프로토타입 객체에 있는 프로퍼티는 객체가 사용할 수 있다.(프로퍼티 상속) */
book.introduce();                                           // 모던 JavaScript(이)가 그렇게 좋다죠~

/* 클래스의 메소드는 역시나 프로토타입 객체에 정의가 된다. */
console.log(Object.getOwnPropertyDescriptors(book.__proto__));

console.log(book.name);                                     // 모던 JavaScript
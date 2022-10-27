/* 02. class expression(클래스 표현식) */

/* 1. 익명 클래스 표현식 */
let Tutor = class{
    teach(){
        console.log('이해하셨나요~');
    }
}

new Tutor().teach();
console.log(Tutor);                                 // 이해하셨나요~, [class Tutor] (기본 생성자)

/* 2. 기명 클래스 표현식 */
let Tutee = class MyTutee{
    learn(){
        console.log('우와~ 이해했어요~');
        console.log(MyTutee);                       // 내부에서는 에러 발생하지 않음
    }
}

new Tutee().learn();                                // 우와~ 이해했어요~
// console.log(MyTutee);                            // MyTutee is not defined

/* 3. 클래스 동적 생성(메소드 호출 시 생성) */
function makeTutee(message){
    return class{
        feedback(){
            console.log(message);
        }
    };
}

let SecondTutee = makeTutee("100점이에요!");        // [class MyTutee] (생성 된 Calss 객체 반환)
new SecondTutee().feedback();                       // 100점이에요! (내부 메서드 시행 가능)

/* 클래스도 함수처럼 일급 객체이며 다른 표현식 내부에서 정의, 전달, 반환, 할당이 가능하다. */

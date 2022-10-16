/* 01. logical-operator(논리 연산자) */
/* 기본적인 ||(or), &&(And), !(NOT) 문법은 자바와 동일하다. */

/* 01. short-circuit-evaluation(단축 평가) */
/* 표현식을 평가하는 도중 평가 결과가 확정 된 경우 나머지 평가 과정을 생략한다. */

/* 1. OR의 경우 */
// 왼쪽 값이 false이면 오른쪽 아니면 왼쪽
console.log('apple' || 'banana');           // apple
console.log(false || 'banana');             // banana
console.log('apple' || false);              // apple

/* 2. And의 경우 */
// 왼쪽 값이 true라면 오른쪽 아니면 왼쪽
console.log('apple' && 'banana');           // banana
console.log(false && 'banana');             // false
console.log('apple' && false);              // false

/* 단축 평가를 사용하면 if문을 대체할 수 있다. */
var num = 1;

if(num % 2 == 0)
    console.log('짝수입니다.');
else 
    console.log('홀수입니다.');

/* 단축 평가를 활용하여 같은 결과를 얻을 수 있다.(해당 되는 항을 실행도 시켜준다.) */    
num % 2 == 0 && console.log('짝수입니다.');
num % 2 == 0 || console.log('홀수입니다.');    

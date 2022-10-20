/* 04. callback-function(콜백 함수) */
/*
    함수의 매개변수를 통해 다른 함수의 내부로 전달되는 함수를 콜백 함수라고 한다.
    매개변수를 통해 함수의 외부에서 콜백 함수를 전달 받은 함수를 고차 함수라고 한다.
    콜백 함수는 고차 함수에 전달되어 헬퍼 함수의 역할을 한다.
*/

/* 전달 받은 값을 1 증가 시켜주는 함수 */
function increase(value){
    return value + 1;
}

/* 전달 받은 값을 1 감소 시켜주는 함수 */
function decrease(value){
    return value - 1;
}

/* 전달 받은 함수에 전달 받은 값을 적용 시켜주는 고차 함수 */
function apply(func, value){
    return func(value);
}

console.log(apply(increase, 5));                // increase는 콜백 함수가 된다.
console.log(apply(decrease, 5));                // decrease는 콜백 함수가 된다. 

console.log(apply(function(value){return value * 2;}, 5));

/* 비동기 처리(이벤트, 타이머, ajax)에 활용되는 중요한 패턴이다. */

/* 배열의 정렬을 다룰 때의 예시 */
console.log([3, 2, 1, 5, 4].sort(function(left, right){return right - left;}));
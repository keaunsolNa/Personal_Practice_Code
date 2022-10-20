/* 05. pure-and-impure-function(순수 함수와 비순수 함수) */
/* 
    순수 함수 : 외부 상태에 의존하지도 않고 변경하지도 않는 함수(전달인자가 같으면 항상 같은 값을 반환하는 함수이기도 함)
    비순수 함수 : 외부 상태에 의존하거나 외부 상태를 변경하는 함수
*/

var cnt = 0;

/* 순수 함수 */
function increase(n){
    return ++n;
}

console.log(increase(cnt));             // 1
console.log(cnt);                       // 0

/* 비순수 함수 */
function decrease(){
    return --cnt;
}

/* 비순수 함수는 외부 상태(cnt)의 영향을 주고 받아 상태 변화를 추적하기 어려워 진다. (실행할 때마다 결과치 예측이 어렵다.) */
console.log(cnt);                       // 0
console.log(decrease(cnt));             // -1
console.log(cnt);                       // -1

/* 함수 외부 상태의 변경에 영향을 주고 받지 않는(지양하는) 순수 함수를 사용하는 것이 좋다. (예측이 가능하고 수정이 용이하다.) */
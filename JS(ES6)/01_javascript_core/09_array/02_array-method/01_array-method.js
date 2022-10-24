/* 01. array-method(배열 메소드) */

const foodList = ['물회', '삼계탕', '냉면', '수박', '물회'];

/* indexOf */
console.log(`foodList.indexOf('물회') : ${foodList.indexOf('물회')}`);              // 0
console.log(`foodList.indexOf('삼겹살') : ${foodList.indexOf('삼겹살')}`);          // -1(없으면 -1)

/* includes */
console.log(`foodList.includes('물회') : ${foodList.includes('물회')}`);            // true
console.log(`foodList.includes('삼겹살') : ${foodList.includes('삼겹살')}`);        // false

const chineseFood = ['짜장면', '짬뽕', '우동'];
/* push */
chineseFood.push('탕수육');
chineseFood.push('양장피');

console.log(`push 후 : ${chineseFood}`);                                                    // push 후 : 짜장면,짬뽕,우동,탕수육,양장피

/* pop */
console.log(`chineseFood.pop() : ${chineseFood.pop()}`);                                    // chineseFood.pop() : 양장피
console.log(`chineseFood.pop() : ${chineseFood.pop()}`);                                    // chineseFood.pop() : 탕수육
console.log(`chineseFood.pop() : ${chineseFood.pop()}`);                                    // chineseFood.pop() : 우동

console.log(`pop 후 : ${chineseFood}`);                                                     // pop 후 : 짜장면,짬뽕

const chickenList = ['양념치킨', '후라이드', '파닭'];

/* unshift */
console.log(`chickenList.unshift(): ${chickenList.unshift('간장치킨')}`);                   // chickenList.unshift(): 4
console.log(`chickenList.unshift(): ${chickenList.unshift('마늘치킨')}`);                   // chickenList.unshift(): 5

console.log(`unshift 후 chickenList : ${chickenList}`);                                     // unshift 후 chickenList : 마늘치킨,간장치킨,양념치킨,후라이드,파닭

/* shift */
console.log(`checkinList.shift(): ${chickenList.shift()}`);                                 // checkinList.shift(): 마늘치킨
console.log(`shift 후 checkinList : ${chickenList}`);                                       // shift 후 checkinList : 간장치킨,양념치킨,후라이드,파닭

/* concat: 두 개 이상의 배열을 결합 */
const idol1 = ['서태지와 아이들', '소녀시대'];
const idol2 = ['HOT' , '잭스키스'];
const idol3 = ['핑클', '블랙핑크'];

console.log(`idol1 기준으로 idol2 배열을 concat : ${idol1.concat(idol2)}`)                  // idol1 기준으로 idol2 배열을 concat : 서태지와 아이들,소녀시대,HOT,잭스키스
console.log(`idol1 기준으로 idol2 배열을 concat : ${typeof idol1.concat(idol2)}`)           // idol1 기준으로 idol2 배열을 concat : object
console.log(`idol3 기준으로 idol1, idol2 배열을 concat : ${idol3.concat(idol1, idol2)}`);   // idol3 기준으로 idol1, idol2 배열을 concat : 핑클,블랙핑크,서태지와 아이들,소녀시대,HOT,잭스키스
console.log(`ES6 스프레드 연산자 사용하여 concat : ${[...idol1, ...idol2]}`)                // ES6 스프레드 연산자 사용하여 concat : 서태지와 아이들,소녀시대,HOT,잭스키스

/* slice : 배열의 요소 선택 잘라내기 */

/* splice : 배열의 index 위치의 요소 제거 및 추가 */
const front = ['HTML', 'CSS', "Javascript", 'React'];

console.log(`front slice(1, 3): ${front.slice(1, 3)}`);                                     // front slice(1, 3): CSS,Javascript
console.log(`front: ${front}`);                                                             // front: HTML,CSS,Javascript,React (원본에 지장을 주지 않는다.)

/* splice(index, 제거수, 추가값1, 추가값2, ...) */
console.log(`front.splice(3, 1, "JDBC") : ${front.splice(3, 1, "JDBC")}`);                  // front.splice(3, 1, "JDBC") : React
console.log(`front : ${front}`);                                                            // front : HTML,CSS,Javascript,JDBC (원본에 영향을 준다.)

/* join : 배열을 구분자로 결합하여 문자열로 반환 */
const snackList = ['사탕', '초콜렛', '껌', '과자'];
console.log(`snackList.join() : ${snackList.join()}`);                                      // snackList.join() : 사탕,초콜렛,껌,과자
console.log(`snackList.join('/) : ${snackList.join('/')}`);                                 // snackList.join('/) : 사탕/초콜렛/껌/과자
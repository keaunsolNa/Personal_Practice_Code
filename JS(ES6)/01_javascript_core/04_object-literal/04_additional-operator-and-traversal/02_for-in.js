/* 02. for-in(for in 반복문) */
/* 객체의 모든 프로퍼티 키 순회 */
var student = {
    name : '유관순',
    age : 16,
    getInfo : function(){
        return `${this.name}(은)는 ${this.age}세입니다.`;
    }
};

for(var key in student){
    console.log(`key : ${key}`);                            // 키
    console.log(`student[${key}] : ${student[key]}`);       // 키에 해당하는 값
}

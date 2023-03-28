// // //필요한 모듈들을 가져오기 
const express = require("express");
const bodyParser = require('body-parser');

// const db = require('./db');

// //Express 서버를 생성
const app = express();

// // json 형대토 오는 요청의 본문을 해석해줄수있게 등록
// app.use(bodyParser.json());

// // 테이블 생성하기 
// db.pool.query(`CREATE TABLE lists (
//     id INTEGER AUTO_INCREMENT,
//     value TEXT, 
//     PRIMARY KEY (id)
// )`, (err, results, fileds) => {
//     console.log('results', results)
// })

// //DB lists 테이블에 있는 모든 데이터를 프론트 서베에 보내주기 
// app.get('/api/hi', function (req, res) {
//     //데이테베이스에서 모든 정보 가져오기 
//    res.status(200).send('good')
// })

// //DB lists 테이블에 있는 모든 데이터를 프론트 서베에 보내주기 
// app.get('/api/values', function (req, res) {
//     //데이테베이스에서 모든 정보 가져오기 
//     db.pool.query('SELECT * FROM lists;',
//         (err, results, fileds) => {
//             if (err)
//                 return res.status(500).send(err)
//             else
//                 return res.json(results)
//         })
// })

// // 클라이언트에서 입력한 값을 데이터베이스 lists 테이블에 넣어주기
// app.post('/api/value', function (req, res, next) {
//     //데이터베이스에 값 넣어주기
//     db.pool.query(`INSERT INTO lists (value) VALUES("${req.body.value}")`,
//         (err, results, fileds) => {
//             if (err)
//                 return res.status(500).send(err)
//             else
//                 return res.json({ success: true, value: req.body.value })
//         })
// })

app.listen(5000, () => {
    console.log('애플리케이션이 5000번 포트에서 시작되었습니다.')
})

// const express = require("express");
// const redis = require("redis");
// //레디스 클라이언트 생성 
// const client = redis.createClient({
//     host: "redis-server",
//     port: 6379
// }) 

// const app = express();

// //숫자는 0 부터 시작합니다.
// client.set("number", 0);

// app.get('/', (req, res) => {
//     client.get("number", (err, number) => {
//         //현재 숫자를 가져온 후에 1씩 올려줍니다.
//         res.send("숫자가 1씩 올라갑니다. 숫자: " + number)
//         client.set("number", parseInt(number) + 1)
//     })
// })


// app.listen(8080);
console.log('Server is running');
const obj = { 
    a: 27
}

const obj2 = {
    a: 27
}

console.log(obj === obj2)


class Singleton {
    constructor() {
        if (!Singleton.instance) {
            Singleton.instance = this
        }
        return Singleton.instance
    }

    getInstance() {
        return this.instance
    }
}

const a = new Singleton()
const b = new Singleton() 
console.log(a === b)


const URL = 'mongodb://localhost:27017/kundolapp'
const createConnection = url => ({"url" : url})
class DB {
    constructor(url) {
        if(!DB.instance) {
            DB.instance = createConnection(url)
        }
        return DB.instance
    }
    connect() {
        return this.instance
    }
}

const c = new DB(URL)
const d = new DB(URL)

console.log(c === d)


Mongoose.prototype.connect = function(uri, options, callback) {
    const _mongoose = this instanceof Mongoose ? this : mongoose;
    const conn = _mongoose.connection;

    return _mongoose._promiseOrCallback(callback, cb => {
        conn.openUri(uri, options, err => {
            if(err != null) {
                return cb(err);
            }
            return cb(null, _mongoose);
        });
    });
};


// 메인 모듈
import mysql from 'mysql'
const pool = mysql.createPool({
    connectionLimit: 10,
    host: 'example.org',
    user: 'keaunsol',
    password: 'secret',
    database: 'keaunsolDB'
});

pool.connect();

// 모듈 A
pool.query(query, function (error, results, fields) {
    if (error) throw error;
    console.log('The Soluction is: ', results[0].solution);
});

// 모듈 B
pool.query(query, function (error, results, fields) {
    if(error) throw error;
    console.log('The Soluction is: ', results[0].solution);
});
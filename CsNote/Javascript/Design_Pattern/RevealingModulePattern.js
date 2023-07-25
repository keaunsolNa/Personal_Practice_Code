const keaunsol = (() => {
    const a = 1
    const b = () => 2
    const public = {
        c : 2,
        d : () => 3
    }
    return public
}) ()
console.log(keaunsol)       // { c: 2, d: [Function: d] }
console.log(keaunsol.a)     // undefined


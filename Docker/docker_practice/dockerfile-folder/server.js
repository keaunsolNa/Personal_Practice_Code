const express = require('express');

// Constants
const PORT = 8080;
const HOST = '0.0.0.0';

// APP
const app = express();
app.get('/', (req, res) => {
    res.send("Hellow World")
});

app.listen(PORT);
console.log('Running on http://&{HOST}:${RORT}');
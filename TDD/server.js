const express = require('express');
const PORT = 5000;
const app = express();
const productRoutes = require("./routes");
const mongoose = require('mongoose');

mongoose.connect('mongodb+srv://<userId>:<userPwd>@<clusterName>.c2d9bui.mongodb.net/?retryWrites=true&w=majority',
    {
        useNewUrlParser: true,
        useUnifiedTopology: true,
    })
    .catch(err => console.log(err));

app.use(express.json());
app.use("/api/products", productRoutes)
app.get('/', (req, res) => {
    res.send('Hello World');
});

app.use((error, req, res, next) => {
    res.status(500).json({ message: error.message })
})

// app.listen(PORT);
// console.log(`Running on port ${PORT}`);

module.exports = app;
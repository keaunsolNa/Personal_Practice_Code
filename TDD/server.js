const express = require('express');
const PORT = 5000;
const app = express();
const productRoutes = require("./routes");
const mongoose = require('mongoose');

mongoose.connect('mongodb+srv://knsol1992:knsol6868595@cluster0.c2d9bui.mongodb.net/?retryWrites=true&w=majority',
    {
        useNewUrlParser: true,
        useUnifiedTopology: true,
    })
    .then(() => console.log('MongoDb Connected...'))
    .catch(err => console.log(err));

app.use(express.json());
app.use("/api/products", productRoutes)
app.get('/', (req, res) => {
    res.send('Hello World');
});













app.listen(PORT);
console.log(`Running on port ${PORT}`);
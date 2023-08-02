const express = require('express');
const router = express.Router();
const productController = require("./controller/product");

router.post('/', productController.createProduct)

module.exports = router;
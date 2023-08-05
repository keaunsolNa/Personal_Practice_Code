const express = require('express');
const router = express.Router();
const productController = require("./controller/product");

router.post('/', productController.createProduct);
router.get('/', productController.getProducts);
router.get('/:productId', productController.getProductById);
router.put('/:productId', productController.getProductById);
router.delete('/:productId', productController.deleteProduct);

module.exports = router;
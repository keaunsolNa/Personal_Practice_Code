const request = require('supertest')
const app = require('../../server');
const newProduct = require('../data/net-product.json')

let firstProduct;

it("POST /api/products", async () => {
    const response = await request(app)
        .post("/api/products")
        .send(newProduct);
    expect(response.statusCode).toBe(201)
    expect(response.body.name).toBe(newProduct.name)
    expect(response.body.description).toBe(newProduct.description)
});

it("should return 500 on Post /api/products", async () => {
    const response = await request(app)
    .post('/api/products')
    .send({name: "keaunsol" })
    expect(response.statusCode).toBe(500);

    expect(response.body).toStrictEqual({ message: "Product validation failed: description: Path `description` is required."})
});

it("GET /api/products ", async () => {
    const response = await request(app).get('/api/products');
    expect(response.statusCode).toBe(200);
    expect(Array.isArray(response.body)).toBeTruthy();
    expect(response.body[0].name).toBeDefined();
    expect(response.body[0].description).toBeDefined();
    firstProduct = response.body[0];

});

it("Get /api/product/:productId", async () => {
    const response = await request(app).get('/api/products/' + firstProduct._id);
    expect(response.statusCode).toBe(200);
    expect(response.body.name).toBe(firstProduct.name);
    expect(response.body.description).toBe(firstProduct.description);

});

it("Get id doenst exist /api/product/:productId", async () => {
    const response = await request(app).get('/api/products/64cb0274a1c1ae609bc7f078');
    expect(response.statusCode).toBe(404);
});

it("PUT /api/products", async() => {
    const res = await request(app)
                .put("/api/products/"+firstProduct._id)
                .send({ name: "Keaunsol2", description: "Good2"});
    expect(res.statusCode).toBe(200)
    expect(res.body.name).toBe("Keaunsol2")
    expect(res.body.description).toBe("Good2")
});

it("should return 404 on PUT /api/products", async () => {
    const res = await request(app)
        .put("/api/products" +"64cb0274a1c1ae609bc7f079")
        .send({ name: "Keaunsol2", description: "Good2"})
    expect(res.statusCode).toBe(404);
});

it("DELETE /api/products", async () => {
    const res = await request(app)
        .delete("/api/products/" + firstProduct._id)
        .send();
    expect(res.statusCode).toBe(200);
});

it("DELETE id doenst exist /api/products/:productId", async () => {
    const res = await request(app)
        .delete("/api/products/" + firstProduct._id)
        .send();
    expect(res.statusCode).toBe(404);
});


package com.example.spring_boot_crud.controller;

import com.example.spring_boot_crud.entity.Product;
import com.example.spring_boot_crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addproducts")
    public List<Product> addAllProduct(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProduct(){
        return service.getProducts();
    }

    @GetMapping("/producti/{id}")
    public Product fingById(@PathVariable int id){
        return service.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Product findByName(@PathVariable String name){
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteById(id);
    }

    /* for your reference if needed do operations via postman
     [
    {
        "id": 1,
        "name": "tablet",
        "quantity": 150,
        "price": 280000.0
    },
    {
        "id": 2,
        "name": "gaming-console",
        "quantity": 1543,
        "price": 175000.0
    },
    {
        "id": 3,
        "name": "8k-monitor",
        "quantity": 2343,
        "price": 45000.0
    },
    {
        "id": 4,
        "name": "cpu",
        "quantity": 6541,
        "price": 400000.0
    },
    {
        "id": 5,
        "name": "camera",
        "quantity": 53216,
        "price": 250000.0
    }
     ]
     */
}

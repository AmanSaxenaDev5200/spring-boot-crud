package com.example.spring_boot_crud.service;

import com.example.spring_boot_crud.entity.Product;
import com.example.spring_boot_crud.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

//    These two are post methods
    public Product saveProduct(Product product){
        return repo.save(product);
    }

    public List<Product> saveProducts(List<Product> products){
        return repo.saveAll(products);
    }

//    These two are get methods
    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(@PathVariable int id){
        return repo.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return repo.findByName(name);
    }


//    These are methods for put

    public String deleteById(int id){
        repo.deleteById(id);
        return "Product deleted" + id;
    }

    public Product updateProduct(Product product){
        Product existingproduct = repo.findById(product.getId()).orElse(null);
        existingproduct.setName(product.getName());
        existingproduct.setPrice(product.getPrice());
        existingproduct.setQuantity(product.getQuantity());
        return repo.save(existingproduct);
    }
}

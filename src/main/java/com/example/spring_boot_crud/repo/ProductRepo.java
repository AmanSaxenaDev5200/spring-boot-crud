package com.example.spring_boot_crud.repo;

import com.example.spring_boot_crud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo  extends JpaRepository<Product,Integer> {

    Product findByName(String name);
}

package com.example.cake_ordering_system.repository;

import com.example.cake_ordering_system.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findAllByCategory_Id(int id);
}

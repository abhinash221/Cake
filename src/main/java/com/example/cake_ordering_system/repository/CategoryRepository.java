package com.example.cake_ordering_system.repository;


import com.example.cake_ordering_system.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer > {
}

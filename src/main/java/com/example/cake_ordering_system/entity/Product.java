package com.example.cake_ordering_system.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
    private Double price;
    private Double Weight;
    private String description;
    private String imageName;
}
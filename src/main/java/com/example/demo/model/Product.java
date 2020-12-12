package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String image;
    private Long price;
    private Long view;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Category> categories;
}

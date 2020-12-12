package com.example.demo.service.category;

import com.example.demo.model.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryService categoryService;

    @Override
    public Iterable<Category> findAll() {
        return categoryService.findAll();
    }

    @Override
    public Category save(Category category) {
        return categoryService.save(category);
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryService.findById(id);
    }

    @Override
    public void remove(Long id) {
        categoryService.remove(id);
        return;
    }
}

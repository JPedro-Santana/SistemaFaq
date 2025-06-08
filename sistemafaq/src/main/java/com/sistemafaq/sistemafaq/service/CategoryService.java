package com.sistemafaq.sistemafaq.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sistemafaq.sistemafaq.model.Category;
import com.sistemafaq.sistemafaq.repository.CategoryRepository;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    
    

}

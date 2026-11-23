package com.subhanshu.ecommerce.service;


import com.subhanshu.ecommerce.entity.Category;
import com.subhanshu.ecommerce.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public Category addCategory(Category category){
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories() {
        return  categoryRepository.findAll();
    }
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + id));
    }
    public void deleteCategory(Long id){
        Category category = getCategoryById(id);
        categoryRepository.delete(category);
    }
}

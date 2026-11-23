package com.subhanshu.ecommerce.controller;

import com.subhanshu.ecommerce.entity.Category;
import com.subhanshu.ecommerce.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categories")
public class Categorycontroller{

    private final CategoryService categoryService;
    public Categorycontroller(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping
    public Category addCategory(@RequestBody Category category){
        return categoryService.addCategory(category);
    }

    @GetMapping

    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id){
        return categoryService.getCategoryById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }
}

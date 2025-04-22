package com.example.ecommes.Service.Impl;

import com.example.ecommes.Repository.CategoryRepository;
import com.example.ecommes.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class CategoryServiceImpl {


    private CategoryRepository categoryRepository;


    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }


    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }


    public Boolean existCategory(String name) {
        return categoryRepository.existsByName(name);
    }


    public Boolean deleteCategory(int id) {
        Category category = categoryRepository.findById(id).orElse(null);

        if (!ObjectUtils.isEmpty(category)) {
            categoryRepository.delete(category);
            return true;
        }
        return false;
    }


    public Category getCategoryById(int id) {
        Category category = categoryRepository.findById(id).orElse(null);
        return category;
    }


    public List<Category> getAllActiveCategory() {
        List<Category> categories = categoryRepository.findByIsActiveTrue();
        return categories;
    }

    public Page<Category> getAllCategorPagination(Integer pageNo, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        return categoryRepository.findAll(pageable);
    }

}

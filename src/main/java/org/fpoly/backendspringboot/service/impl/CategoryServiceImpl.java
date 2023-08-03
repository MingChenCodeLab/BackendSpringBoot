package org.fpoly.backendspringboot.service.impl;

import org.fpoly.backendspringboot.model.entity.Category;
import org.fpoly.backendspringboot.model.entity.Product;
import org.fpoly.backendspringboot.repository.CategoryRepository;
import org.fpoly.backendspringboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(@Autowired CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Optional<List<Category>> findAll() {
        List<Category> result = categoryRepository.findAll();
        return Optional.of(result);
    }

    @Override
    public Optional<Category> findById(Long categoryId) {
        return categoryRepository.findById(categoryId);
    }

}

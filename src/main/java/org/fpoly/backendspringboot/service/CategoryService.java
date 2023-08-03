package org.fpoly.backendspringboot.service;

import org.fpoly.backendspringboot.model.entity.Category;
import org.fpoly.backendspringboot.model.entity.Product;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Optional<List<Category>> findAll();
    Optional<Category> findById(Long categoryId);
}

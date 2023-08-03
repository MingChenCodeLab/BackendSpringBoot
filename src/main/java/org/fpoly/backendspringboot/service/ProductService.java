package org.fpoly.backendspringboot.service;

import org.fpoly.backendspringboot.model.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Optional<List<Product>> getProductsByCategory(Long categoryId);
}

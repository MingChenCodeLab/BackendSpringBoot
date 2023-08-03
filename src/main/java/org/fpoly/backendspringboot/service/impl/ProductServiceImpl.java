package org.fpoly.backendspringboot.service.impl;

import org.fpoly.backendspringboot.model.entity.Product;
import org.fpoly.backendspringboot.repository.ProductRepository;
import org.fpoly.backendspringboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(@Autowired ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Optional<List<Product>> getProductsByCategory(Long categoryId) {
        return productRepository.findAllByCategory_CategoryId(categoryId);
    }
}

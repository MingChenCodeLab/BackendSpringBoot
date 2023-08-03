package org.fpoly.backendspringboot.repository;

import org.fpoly.backendspringboot.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<List<Product>> findAllByCategory_CategoryId(Long categoryId);
}

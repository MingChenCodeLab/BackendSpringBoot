package org.fpoly.backendspringboot.repository;

import org.fpoly.backendspringboot.model.entity.Category;
import org.fpoly.backendspringboot.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

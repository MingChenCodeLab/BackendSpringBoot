package org.fpoly.backendspringboot.repository;

import org.fpoly.backendspringboot.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

package org.fpoly.backendspringboot.repository;

import org.fpoly.backendspringboot.model.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
}

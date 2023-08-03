package org.fpoly.backendspringboot.repository;

import org.fpoly.backendspringboot.model.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}

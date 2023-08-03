package org.fpoly.backendspringboot.repository;

import org.fpoly.backendspringboot.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

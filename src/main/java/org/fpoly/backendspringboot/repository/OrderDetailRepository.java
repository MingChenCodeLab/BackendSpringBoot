package org.fpoly.backendspringboot.repository;

import org.fpoly.backendspringboot.model.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}

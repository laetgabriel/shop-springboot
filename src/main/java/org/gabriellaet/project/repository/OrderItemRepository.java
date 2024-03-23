package org.gabriellaet.project.repository;

import org.gabriellaet.project.models.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

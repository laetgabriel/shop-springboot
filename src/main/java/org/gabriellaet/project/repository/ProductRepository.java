package org.gabriellaet.project.repository;

import org.gabriellaet.project.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

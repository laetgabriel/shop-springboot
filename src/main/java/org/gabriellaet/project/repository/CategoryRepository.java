package org.gabriellaet.project.repository;

import org.gabriellaet.project.models.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

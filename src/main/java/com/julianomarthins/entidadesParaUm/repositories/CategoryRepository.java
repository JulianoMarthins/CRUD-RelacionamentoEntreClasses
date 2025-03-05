package com.julianomarthins.entidadesParaUm.repositories;

import com.julianomarthins.entidadesParaUm.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

package com.julianomarthins.entidadesParaUm.repositories;

import com.julianomarthins.entidadesParaUm.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

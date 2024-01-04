package com.ThiagoSantos.PDV.domain.repositories;

import com.ThiagoSantos.PDV.core.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

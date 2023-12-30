package com.ThiagoSantos.PDV.infrastructure.repositories;

import com.ThiagoSantos.PDV.core.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}

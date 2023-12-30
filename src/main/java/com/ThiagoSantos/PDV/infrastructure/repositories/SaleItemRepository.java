package com.ThiagoSantos.PDV.infrastructure.repositories;

import com.ThiagoSantos.PDV.core.entities.SaleItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleItemRepository extends JpaRepository<SaleItem, Long> {
}

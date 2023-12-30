package com.ThiagoSantos.PDV.infrastructure.repositories;

import com.ThiagoSantos.PDV.core.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

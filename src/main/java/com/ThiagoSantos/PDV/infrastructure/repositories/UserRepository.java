package com.ThiagoSantos.PDV.infrastructure.repositories;

import com.ThiagoSantos.PDV.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

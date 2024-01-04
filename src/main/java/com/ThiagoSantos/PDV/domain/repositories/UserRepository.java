package com.ThiagoSantos.PDV.domain.repositories;

import com.ThiagoSantos.PDV.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

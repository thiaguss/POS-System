package com.ThiagoSantos.PDV.infrastructure.config;

import com.ThiagoSantos.PDV.core.entities.User;
import com.ThiagoSantos.PDV.domain.enums.UserRole;
import com.ThiagoSantos.PDV.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null,"Thiago Santos", "thiaguss", "123456789", UserRole.ADMIN);
        userRepository.save(user1);
    }
}

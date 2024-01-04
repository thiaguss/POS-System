package com.ThiagoSantos.PDV.domain.services;

import com.ThiagoSantos.PDV.core.entities.User;
import com.ThiagoSantos.PDV.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found with id: " + id));
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User update(Long id, User userUpdate) {
        User existingUser = findById(id);
        existingUser.updateFields(userUpdate);
        return userRepository.save(existingUser);
    }

    public User delete(Long id){
        User userToDeleted = findById(id);
        userRepository.deleteById(id);
        return userToDeleted;
    }
}

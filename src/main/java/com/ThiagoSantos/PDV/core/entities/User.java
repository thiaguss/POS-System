package com.ThiagoSantos.PDV.core.entities;

import com.ThiagoSantos.PDV.domain.enums.UserRole;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String login;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;

    public User(){}

    public User(Long id, String name, String login, String password, UserRole role) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public void updateFields(User updatedUser) {
        this.name = updatedUser.getName();
        this.login = updatedUser.getLogin();
        this.password = updatedUser.getPassword();
        this.role = updatedUser.getRole();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}

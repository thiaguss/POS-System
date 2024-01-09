package com.ThiagoSantos.PDV.core.entities.dto;

import com.ThiagoSantos.PDV.domain.enums.UserRole;

public record UserDto(String name, String login, String password, UserRole role) {
}
